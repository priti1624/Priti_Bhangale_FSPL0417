package com.sampleProject.EmployeeManagementSystem.controller;

import com.sampleProject.EmployeeManagementSystem.dto.DepartmentDto;
import com.sampleProject.EmployeeManagementSystem.entity.DepartmentInfoEntity;
import com.sampleProject.EmployeeManagementSystem.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.FOUND;

@RestController
@RequestMapping("/ems")
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;

    @PostMapping("/addData")
    public ResponseEntity<DepartmentInfoEntity> addData(@RequestBody DepartmentDto departmentDto){
        return new ResponseEntity<>(departmentService.addData(departmentDto),CREATED);
    }

    @GetMapping("/getAllD")
    public ResponseEntity<List<DepartmentInfoEntity>> getAllData(){
        return new ResponseEntity<>(departmentService.getAllData(),FOUND);
    }
}
