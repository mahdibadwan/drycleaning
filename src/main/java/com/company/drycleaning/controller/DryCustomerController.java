package com.company.drycleaning.controller;


import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Controller
@RequestMapping("/dryCustomer")
public class DryCustomerController {

    @GetMapping
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView();
        DryCustomer dryCustomer = new DryCustomer();
        dryCustomer.setId(1133l);
        dryCustomer.setName("userFirst");

       modelAndView.addObject("userName",  "mahdi badwawn" );


        modelAndView.addObject("dryCustomer", dryCustomer);


        //List<DryCustomer> dryCustomers = dryCustomerService.findAllDryCustomersByUser(user);
        List<DryCustomer> dryCustomers = new ArrayList<>();
        DryCustomer dryCustomer1 = new DryCustomer();
        dryCustomer1.setId(1l);
        dryCustomer1.setName("userFirst");
        DryCustomer dryCustomer2 = new DryCustomer();
        dryCustomer2.setId(2L);
        dryCustomer2.setName("userFirst");
        dryCustomers.add(dryCustomer1);
        dryCustomers.add(dryCustomer2);
        modelAndView.addObject("customers", dryCustomers);

        modelAndView.setViewName("dryclean/dryCustomer");
        return modelAndView;
    }



}
