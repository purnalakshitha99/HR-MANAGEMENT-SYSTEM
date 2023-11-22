package com.purna.HRMANAGEMENTNEW.controller;

import com.purna.HRMANAGEMENTNEW.controller.requeset.CreateEmployeeRequest;
import com.purna.HRMANAGEMENTNEW.controller.response.CreateEmployeeResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
public class EmployeeController {
//    @ResponseStatus(HttpStatus.CREATED)
//    @PostMapping("/employees")
//    public CreateEmployeeResponse employeeRegistration(@RequestBody CreateEmployeeRequest request){
//        System.out.println("Employee Age :"+request.getAge());
//        System.out.println("Employee Name :"+request.getName());
//
//        CreateEmployeeResponse response = new CreateEmployeeResponse();
//        response.setId(15);
//        return response;
//    }




    @PostMapping("/employees")
    public ResponseEntity add(@RequestBody CreateEmployeeRequest request){
        System.out.println("Employee Age :"+request.getAge());
        System.out.println("Employee Name :"+request.getName());

        CreateEmployeeResponse response = new CreateEmployeeResponse();
        response.setId(10);
        return ResponseEntity.created(URI.create("/employees")).header("abc","java").body(response);
    }

    @GetMapping("/employees")
    public void get(){
        System.out.println("get employees");
    }
    @GetMapping("/employees/{emp-id}")
    public void getSingle(){
        System.out.println("get single employees");
    }
    @PutMapping("/employees/{emp-id}")
    public void updte(){
        System.out.println("update employee");
    }
    @DeleteMapping("/employees")
    public void deleteAll(){
        System.out.println("Delete all employees");
    }
    @DeleteMapping("/employees/{emp-id}")
    public void deleteSpecific(){
        System.out.println("delete Specific employees");
    }
}
