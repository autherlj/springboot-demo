package com.sibo.example.springbootdemo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/html/")
public class HtmlController {

    @GetMapping("test")
    public String testHtml(ModelMap mmap){
        mmap.put("context","Spring Boot is designed to get you up and running as quickly as possible, with minimal upfront configuration of Spring. Spring Boot takes an opinionated view of building production-ready applications");
        return "test";
    }

}
