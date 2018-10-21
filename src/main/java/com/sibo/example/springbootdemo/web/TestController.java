package com.sibo.example.springbootdemo.web;

import com.sibo.example.springbootdemo.core.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {

    @GetMapping("/test")
    public R test() {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "czz");
        map.put("email", "cs.chenzz@qq.com");
        map.put("address", "shenzhen gd,China");

        return R.ok().data(map);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public R home() {
        return R.ok().data("--------home page-----");
    }

}
