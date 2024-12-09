package com.sampleProject.EmployeeManagementSystem.service;

import com.sampleProject.EmployeeManagementSystem.dto.DesignationDto;
import com.sampleProject.EmployeeManagementSystem.entity.DesignationInfo;
import com.sampleProject.EmployeeManagementSystem.repository.DesignationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class DesignationService {

    @Autowired
    DesignationRepository designationRepository;

    public DesignationInfo addData(DesignationDto designationDto) {
        DesignationInfo designationInfo=new DesignationInfo();
        designationInfo.setDesignationName(designationDto.getDesignationName());
        designationInfo.setActive(true);
        designationInfo.setCreatedBy(designationDto.getCreatedBy());
        designationInfo.setCreatedDate(LocalDateTime.now());
        designationInfo.setUpdatedBy(designationDto.getUpdatedBy());
        designationInfo.setUpdatedDate(LocalDateTime.now());
        return designationRepository.save(designationInfo);
    }
}
