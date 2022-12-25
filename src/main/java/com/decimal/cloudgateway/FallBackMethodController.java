package com.decimal.cloudgateway;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @PostMapping("/userServiceFallBack")
    public String userServiceFallBackMethod(){
        return "User service is taking longer than Expected." +
                " Please try again later";
    }


    @PostMapping("/departmentServiceFallBack")
    public String departmentServiceFallBackMethod(){
        return "Department service is taking longer than Expected." +
                " Please try again later";
    }
}
