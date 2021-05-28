package com.company.drycleaning.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/mergeCustomer")
public class MergeCustomerController {


    @GetMapping
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userName",  "mahdi badwan" );

        modelAndView.setViewName("dryclean/mergeCustomer");
        return modelAndView;
    }


}
