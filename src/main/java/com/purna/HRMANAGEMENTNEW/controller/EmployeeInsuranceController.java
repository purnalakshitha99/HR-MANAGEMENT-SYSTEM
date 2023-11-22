package com.purna.HRMANAGEMENTNEW.controller;

import com.purna.HRMANAGEMENTNEW.controller.requeset.CreateEmployeeInsuranceRequest;
import com.purna.HRMANAGEMENTNEW.controller.response.CreateEmployeeInsuranceResponse;
import com.purna.HRMANAGEMENTNEW.service.EmployeeInsuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeInsuranceController {
    @Autowired
    private EmployeeInsuranceService employeeInsuranceService;

    @PostMapping("/insurances")
    public CreateEmployeeInsuranceResponse add(@RequestBody CreateEmployeeInsuranceRequest createEmployeeInsuranceRequest){

        employeeInsuranceService.check();

        CreateEmployeeInsuranceResponse createEmployeeInsuranceResponse = new CreateEmployeeInsuranceResponse();

        createEmployeeInsuranceResponse.setId(createEmployeeInsuranceRequest.getInsuranceId());
        createEmployeeInsuranceResponse.setName(createEmployeeInsuranceRequest.getName());
        createEmployeeInsuranceResponse.setType(createEmployeeInsuranceRequest.getType());



        return createEmployeeInsuranceResponse;


    }
}
