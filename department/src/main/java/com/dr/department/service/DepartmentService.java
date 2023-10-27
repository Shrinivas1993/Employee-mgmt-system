package com.dr.department.service;

import com.dr.department.model.Department;
import com.dr.department.model.Project;
import com.dr.department.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    DepartmentRepository departmentRepository;

    @Autowired
    private RestTemplate restTemplate;

    public List<Department> getAllDepartment()
    {
        //Calling project service
        String url="http://localhost:8083/projects";
        List<Project>list=restTemplate.getForObject(url, ArrayList.class);
        System.out.println(list);
        List<Department> department = new ArrayList<>();
        departmentRepository.findAll().forEach(department1 -> department.add(department1));
        return department;
    }

    public Department getDepartmentById(int deptId)
    {
        return departmentRepository.findById(deptId).get();
    }

    public void delete(int deptId)
    {
        departmentRepository.deleteById(deptId);
    }
    public void saveOrUpdate(Department department)
    {
        departmentRepository.save(department);
    }
    public void update(Department department, int deptId)
    {
        departmentRepository.save(department);
    }

}
