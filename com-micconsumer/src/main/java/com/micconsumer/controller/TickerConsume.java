package com.micconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: yhy
 * @Date: 2019/7/24 15:04
 * @Version 1.0
 */
@RestController
public class TickerConsume {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/get")
    public String get() {
        String forObject = restTemplate.getForObject("http://COM-MICPROVIDER/getTicket", String.class);
        return forObject;
    }



}
