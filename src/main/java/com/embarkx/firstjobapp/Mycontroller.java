package com.embarkx.firstjobapp;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mycontroller {
    @RequestMapping("/hello")
    public String data(){
        return "abcd";
    }
    @RequestMapping("/postdata")
    public String postdata(@RequestBody String a){
        return "name is" +a + "shinde";
    }
}
