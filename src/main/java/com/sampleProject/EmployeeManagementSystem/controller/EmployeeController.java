package com.sampleProject.EmployeeManagementSystem.controller;

import com.sampleProject.EmployeeManagementSystem.dto.EmployeeDto;
import com.sampleProject.EmployeeManagementSystem.entity.EmployeeInfo;
import com.sampleProject.EmployeeManagementSystem.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.FOUND;

@RestController
@RequestMapping("/employeemanagement")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/addEmployee")
    public ResponseEntity<EmployeeInfo> addData(@RequestBody EmployeeDto employeeDto){
        return new ResponseEntity<>(employeeService.addData(employeeDto),CREATED);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<EmployeeInfo>> getAllEmployee(){
        return new ResponseEntity<>(employeeService.getAllEmployee(),FOUND);
    }
}
