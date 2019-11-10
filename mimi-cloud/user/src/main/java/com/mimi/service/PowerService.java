package com.mimi.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "SERVER-POWER")
public interface PowerService {

    @GetMapping("getPower")
    Object getPower();


}
