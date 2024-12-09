package com.sampleProject.EmployeeManagementSystem.controller;

import com.sampleProject.EmployeeManagementSystem.dto.DesignationDto;
import com.sampleProject.EmployeeManagementSystem.entity.DesignationInfo;
import com.sampleProject.EmployeeManagementSystem.service.DesignationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/employee")
public class DesignationController {

    @Autowired
    DesignationService designationService;

    @PostMapping("/addData")
    public ResponseEntity<DesignationInfo> addData(DesignationDto designationDto){
        return new ResponseEntity<>(designationService.addData(designationDto),CREATED);
    }
}
