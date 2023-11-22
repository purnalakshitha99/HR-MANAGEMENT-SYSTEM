package com.purna.HRMANAGEMENTNEW.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeDepartmentController {


    @PostMapping("/employees/{emp-id}/deparments")
    public void add(){
        System.out.println("add employee department");
    }

    @GetMapping("/employees/{emp-id}/deparments/{dep-id}")
    public void get(){
        System.out.println("get employee specific department");
    }

    @PutMapping("/employees/{emp-id}/deparments/{dep-id}")
    public void update(){
        System.out.println("update specific employee department");
    }

    @DeleteMapping ("/employees/{emp-id}/deparments")
    public void deleteAll(){
        System.out.println("delete  employee departments");
    }

    @DeleteMapping ("/employees/{emp-id}/deparments/{dep-id}")
    public void deleteSpecific(){
        System.out.println("delete specific employee department");
    }

    @GetMapping("/employees/{emp-id}/deparments")
    public void getAll(){
        System.out.println("get all employee department");
    }




}



