package com.daniel.czajka.dao;

import com.daniel.czajka.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    //here create methods for DAO (data access object)

    //to get all employees
    public List<Employee> findAll();

    //to find employee per id
    public Employee findById(int theEmpId);

    //to save new or update existing employee
    public void save(Employee theEmployee);

    //to delete existing employee
    public void deleteById(int theId);
}
