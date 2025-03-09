package com.embarkx.firstjobapp.job;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JobController {
    @RequestMapping("/hi")
    public String data(){
        return "abcde";
    }
}
