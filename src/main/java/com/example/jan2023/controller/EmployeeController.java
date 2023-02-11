package com.example.jan2023.controller;


import com.example.jan2023.model.Employee;
import com.example.jan2023.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService service;

    @GetMapping("/all")
    public List<Employee> getAllEmployee(){
        return service.getAllEmployee();

    }
}
