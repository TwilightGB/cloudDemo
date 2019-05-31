package com.cloud.ribbon.controller;

import com.cloud.ribbon.service.WareHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountServiceController {
    @Autowired
    private WareHouseService wareHouseService;
    @GetMapping("/count")
    public String count(Integer id){
        return wareHouseService.currentCount(id)+"";
    }
}