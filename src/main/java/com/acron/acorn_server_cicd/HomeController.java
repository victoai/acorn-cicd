package com.acron.acorn_server_cicd;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/hi")
    public  String hi(){
        return  "hi^^$$$ %%%%%%  ^^^^^^^";
    }
}
