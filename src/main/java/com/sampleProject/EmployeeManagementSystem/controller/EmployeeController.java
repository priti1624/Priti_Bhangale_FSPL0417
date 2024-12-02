package com.sampleProject.EmployeeManagementSystem.controller;

import com.sampleProject.EmployeeManagementSystem.dto.EmployeeDto;
import com.sampleProject.EmployeeManagementSystem.entity.EmployeeInfo;
import com.sampleProject.EmployeeManagementSystem.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/ems")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/addEmployee")
    public ResponseEntity<EmployeeInfo> addEmployee(EmployeeDto employeeDto){
        return new ResponseEntity<>(employeeService.addEmployee(employeeDto),CREATED);
    }
}
