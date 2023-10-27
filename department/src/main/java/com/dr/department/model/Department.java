package com.dr.department.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "department_details")
public class Department {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private int deptId;
    private  String deptName;
    @Transient
    private List<Project> list;

    public List<Project> getList() {
        return list;
    }

    public void setList(List<Project> list) {
        this.list = list;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
