package com.springshop.naverapi.cicd;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CICDTestController {


    @GetMapping("/hello")
    public String set(){
        return "success!!";
    }
}
