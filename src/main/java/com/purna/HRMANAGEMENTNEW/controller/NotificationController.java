package com.purna.HRMANAGEMENTNEW.controller;

import com.purna.HRMANAGEMENTNEW.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

    @Autowired
    private NotificationService notificationService;



    @PostMapping("/notifications")
    public void sendNotification(){
        System.out.println("send Notification");
        notificationService.notifyMassage();
    }
}
