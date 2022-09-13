package com.example.ecommerceMVC.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
    @RequestMapping (value = "/findOrder", method = RequestMethod.GET)
    public String getAllOrders(){
        return "Listing All orders";
    }
}
