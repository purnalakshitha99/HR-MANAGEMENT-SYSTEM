package com.purna.HRMANAGEMENTNEW.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

public class EmployeeWorkExperienceController {

    @PostMapping("/employees/{emp-id}/work-experience")
    public void add(){
        System.out.println("add work experience");
    }

    @GetMapping("/employees/{emp-id}/work-experience")
    public void get(){
        System.out.println("get work experience");
    }

    @PutMapping("/employees/{emp-id}/work-experience")
    public void  update(){
        System.out.println("update work experience");
    }

    @DeleteMapping("/employees/{emp-id}/work-experience")
    public void delete(){
        System.out.println("delete work experience");
    }
}
