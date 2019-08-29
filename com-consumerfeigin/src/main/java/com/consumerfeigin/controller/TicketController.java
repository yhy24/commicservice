package com.consumerfeigin.controller;

import com.consumerfeigin.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yhy
 * @Date: 2019/7/25 11:03
 * @Version 1.0
 */
@RestController
public class TicketController {

    @Autowired
    TicketService ticketService;

    @RequestMapping("/get")
    public String getT() {
        System.out.println("*******************");
        return ticketService.getTicket();
    }



}
