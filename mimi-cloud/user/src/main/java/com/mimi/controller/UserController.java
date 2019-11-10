package com.mimi.controller;


import com.mimi.service.PowerService;
import com.mimi.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {

    private static String POWER_URL = "http://SERVER-POWER";

    private static String ORDER_URL = "http://SERVER-ORDER";


    @Autowired
    RestTemplate restTemplate ;

    @Autowired
    PowerService powerService;

    @GetMapping("getUser")
    public R getUser() {

        Map<String, Object> map = new HashMap<>();
        map.put("key", "user");
        return R.success("返回成功", map);
    }
/*
    @GetMapping("getPower")
    public R getPower() {
        return R.success("操作成功", restTemplate.getForObject(POWER_URL+"/getPower", Object.class));

    }
*/

    @GetMapping("getPower")
    public R getPower() {
        return R.success("操作成功", powerService.getPower());

    }
    @GetMapping("getOrder")
    public R getOrder() {
        return R.success("操作成功", restTemplate.getForObject(ORDER_URL+"/getOrder", Object.class));
    }





}
