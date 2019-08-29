package com.micprovider8089.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yhy
 * @Date: 2019/7/24 14:45
 * @Version 1.0
 */
@RestController
public class TicketController {


    @RequestMapping(value = "/getTicket",method = RequestMethod.GET)
    public String getTicket() {
        return "<厉害了，我的国>"+"8089";
    }



}
