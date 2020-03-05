package com.daniel.czajka.entity;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int empId;

    @Column(name = "name")
    private String empName;

    @Column(name = "surname")
    private String empSurname;

    @Column(name = "email")
    private String empEmail;

    public Employee(){
    }

    public Employee(String empName, String empSurname, String empEmail) {
        this.empName = empName;
        this.empSurname = empSurname;
        this.empEmail = empEmail;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpSurname() {
        return empSurname;
    }

    public void setEmpSurname(String empSurname) {
        this.empSurname = empSurname;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empSurname='" + empSurname + '\'' +
                ", empEmail='" + empEmail + '\'' +
                '}';
    }
}
