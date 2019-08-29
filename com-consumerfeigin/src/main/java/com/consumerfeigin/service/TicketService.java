package com.consumerfeigin.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: yhy
 * @Date: 2019/7/25 10:57
 * @Version 1.0
 */
@FeignClient(value = "COM-MICPROVIDER")
public interface TicketService {

    @RequestMapping(value = "/getTicket",method = RequestMethod.GET)
    public String getTicket();


}
