package com.daniel.czajka.service;

import com.daniel.czajka.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> findAll();

    public Employee findById(int theEmployeeId);

    public void save(Employee theEmployee);

    public void deleteById(int theEmployeeId);
}
