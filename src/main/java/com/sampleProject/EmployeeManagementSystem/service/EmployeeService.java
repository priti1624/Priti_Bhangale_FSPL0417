package com.sampleProject.EmployeeManagementSystem.service;

import com.sampleProject.EmployeeManagementSystem.dto.EmployeeDto;
import com.sampleProject.EmployeeManagementSystem.entity.EmployeeInfo;
import com.sampleProject.EmployeeManagementSystem.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;
    public EmployeeInfo addEmployee(EmployeeDto employeeDto) {
        EmployeeInfo employeeInfo=new EmployeeInfo();
        employeeInfo.setEmployeeId(0L);
        employeeInfo.setEmployeeFirstName(employeeDto.getEmployeeFirstName());
        employeeInfo.setEmployeeLastName(employeeDto.getEmployeeLastName());
        employeeInfo.setEmployeeAge(employeeDto.getEmployeeAge());
        employeeInfo.setEmail(employeeDto.getEmail());
        employeeInfo.setDate_Of_Joining(employeeDto.getDate_Of_Joining());
        employeeInfo.setMobNo(employeeDto.getMobNo());
        employeeInfo.setAddress(employeeDto.getAddress());
        employeeInfo.setSalary(employeeDto.getSalary());
        employeeInfo.setActive(true);
        employeeInfo.setCreatedBy(employeeDto.getCreatedBy());
        employeeInfo.setCreatedDate(LocalDateTime.now());
        employeeInfo.setUpdatedBy(employeeDto.getUpdatedBy());
        employeeInfo.setUpdatedDate(LocalDateTime.now());
        return employeeRepository.save(employeeInfo);
    }
}
