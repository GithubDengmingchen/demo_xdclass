package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Video
 *
 * @author dmc 2020/7/30 13:53
 * @version 1.0
 */

@RestController
@RequestMapping("/api/v1/Video")
public class VideoController {
    @GetMapping
    @PostMapping
    @RequestMapping("list")
    public Object list(){
        Map<String,String> map = new HashMap<>(16);
        map.put("1","hbc");
        map.put("2","ydj");
        map.put("3","aaa");
        map.put("4","bbb");
        map.put("5","ccc");
        map.put("6","ddd");
        map.put("7","eee");

        return map;

    }
}
