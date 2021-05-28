package com.company.drycleaning.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class LoginController {



    @GetMapping(value={ "/", "/index"})
    public ModelAndView login(){
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("userName",  "mahdi badwan");
        modelAndView.addObject("adminMessage","Content Available Only for Users with Admin Role");
        List<AutoCompleteSourceItem> dryCustomers = new ArrayList<>();

        DryCustomer dryCustomer = new DryCustomer();
        dryCustomer.setCode("mahditestcode");
        dryCustomer.setId(1L);
        dryCustomer.setName("userFirst");
        AutoCompleteSourceItem item = new AutoCompleteSourceItem();
        item.setId("1");
        item.setLabel("firs user");
        item.setValue("test");
        dryCustomers.add(item);
        modelAndView.addObject("customers", dryCustomers);
       modelAndView.addObject("dryCustomer", dryCustomer);
        modelAndView.setViewName("dryclean/homeSearch");
        return modelAndView;
    }




}
