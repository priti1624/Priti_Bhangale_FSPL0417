package com.sampleProject.EmployeeManagementSystem.dto;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Data
public class EmployeeDto {

    private String employeeFirstName;
    private String employeeLastName;
    private int employeeAge;
    private String email;
    private Date date_Of_Joining;
    private Long mobNo;
    private String address;
    private Long salary;
    private boolean isActive;
    private String createdBy;
    private LocalDateTime createdDate;
    private String updatedBy;
    private LocalDateTime updatedDate;

}
