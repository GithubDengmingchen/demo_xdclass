package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * test
 *
 * @author dmc 2020/7/30 13:53
 * @version 1.0
 */

@RestController
@RequestMapping("/api/v1/Test")
public class TestController {
    @GetMapping
    @PostMapping
    @RequestMapping("list")
    public Object list(){
        Map<String,String> map = new HashMap<>(16);
        map.put("1","hbc");
        map.put("2","ydj");


        return map;

    }
}
