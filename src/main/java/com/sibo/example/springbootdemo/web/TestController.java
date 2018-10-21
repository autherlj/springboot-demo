package com.sibo.example.springbootdemo.web;

import com.sibo.example.springbootdemo.core.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test1")
    public R test1() {
        return R.ok().data("test");
    }

    @GetMapping("/test2")
    public R test2() {
        return R.error("发生错误");
    }

}
