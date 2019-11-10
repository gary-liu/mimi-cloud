package com.mimi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class OrderControler {

    @GetMapping("getOrder")
    public Object getOrder() {
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("key", "order2");

        return resultMap;
    }

}
