package com.purna.HRMANAGEMENTNEW.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

public class EmployeeEducationController {

    @PostMapping("/employees/{emp-id}/eductions-qulifcations")
    public void addE(){
        System.out.println("add employee education qulifications");
    }

    @GetMapping("/employees/{emp-id}/eductions-qulifcations")
    public void get(){
        System.out.println("get employee education qulifications");
    }

    @PutMapping ("/employees/{emp-id}/eductions-qulifcations")
    public void update(){
        System.out.println("update employee education qulifications");
    }

    @DeleteMapping("/employees/{emp-id}/eductions-qulifcations")
    public void delete(){
        System.out.println("delete employee education qulifications");
    }

    @DeleteMapping("/employees/eductions-qulifcations")
    public void deleteAll(){
        System.out.println("delete all education qulifications");
    }




}
