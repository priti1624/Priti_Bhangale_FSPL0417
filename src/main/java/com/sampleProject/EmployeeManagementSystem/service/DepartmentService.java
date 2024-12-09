package com.sampleProject.EmployeeManagementSystem.service;

import com.sampleProject.EmployeeManagementSystem.dto.DepartmentDto;
import com.sampleProject.EmployeeManagementSystem.entity.DepartmentInfoEntity;
import com.sampleProject.EmployeeManagementSystem.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    DepartmentRepository departmentRepository;

    public DepartmentInfoEntity addData(DepartmentDto departmentDto) {
       DepartmentInfoEntity departmentInfoEntity=new DepartmentInfoEntity();
     //  departmentInfoEntity.setDepartmentId(0L);
       departmentInfoEntity.setDepartmentName(departmentDto.getDepartmentName());
       departmentInfoEntity.setActive(true);
       departmentInfoEntity.setCreatedBy(departmentDto.getCreatedBy());
       departmentInfoEntity.setCreatedDate(LocalDateTime.now());
       departmentInfoEntity.setUpdatedBy(departmentDto.getUpdatedBy());
       departmentInfoEntity.setUpdatedDate(LocalDateTime.now());
       return departmentRepository.save(departmentInfoEntity);


    }

    public List<DepartmentInfoEntity> getAllData() {
        List<DepartmentInfoEntity> list=departmentRepository.findAll();
        return list;
    }
}
