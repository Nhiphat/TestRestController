package com.example.controller;

import com.example.dao.EmployeeDao;
import com.example.entity.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TestController {
    @Autowired
    private EmployeeDao employeeDao;
    @RequestMapping(value="/test")
    public Employees getEmployees()
    {
        return employeeDao.getAllEmployees();
    }
}
