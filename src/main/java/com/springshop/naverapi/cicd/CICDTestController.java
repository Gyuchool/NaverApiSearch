package com.springshop.naverapi.cicd;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CICDTestController {


    @GetMapping("/ci")
    public String set(){
        return "one!";
    }
}
