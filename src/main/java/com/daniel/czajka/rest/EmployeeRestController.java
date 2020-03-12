package com.daniel.czajka.rest;

import com.daniel.czajka.entity.Employee;
import com.daniel.czajka.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeRestController(EmployeeService theEmployeService){
        employeeService = theEmployeService;
    }

    //return list of employees as json objects
    @GetMapping("/employees")
    public List<Employee> findAll(){
        return employeeService.findAll();
    }


    //trying to get the model for website
    @GetMapping("/list")
    public String employeeList(Model theModel) {

        //get the data from database
        List<Employee> allEmployees = employeeService.findAll();

        //add data to the model
        theModel.addAttribute("employees", allEmployees);

        //return the data on the website
        return "employeesList";

    }
}
