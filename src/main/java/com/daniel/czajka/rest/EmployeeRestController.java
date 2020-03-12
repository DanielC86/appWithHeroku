package com.daniel.czajka.rest;

import com.daniel.czajka.entity.Employee;
import com.daniel.czajka.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    //return a single object (employee) by ID
    @GetMapping("/employees/{employeeId")
    public Employee getEmployee(@PathVariable int employeeId){
        Employee theEmployee = employeeService.findById(employeeId);

        if (theEmployee == null){
            throw new RuntimeException("Employee ID not found: " + employeeId);
        }

        return theEmployee;
    }

    //adding new object (employee)
    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee theEmployee){
        theEmployee.setEmpId(0);

        employeeService.save(theEmployee);

        return theEmployee;
    }

    //updating existing object (employee)
    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee theEmployee){
        employeeService.save(theEmployee);

        return  theEmployee;
    }

    //deleting existing object (employee) by id
    @DeleteMapping("/employees/{employeeId}")
    public String deleteEmployee(@PathVariable int employeeId){
        Employee theEmployee = employeeService.findById(employeeId);

        if (theEmployee == null){
            throw new RuntimeException("Employee ID not found: " + employeeId);
        }
        employeeService.deleteById(employeeId);

        return "deleted employee with id of: " + employeeId;

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
