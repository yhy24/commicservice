package com.micprovider8090.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yhy
 * @Date: 2019/7/24 14:52
 * @Version 1.0
 */
@RestController
public class TicketController {
    @RequestMapping(value = "/getTicket",method = RequestMethod.GET)
    public String getTicket() {
        return "<厉害了，我的国>"+"8090";
    }
}
