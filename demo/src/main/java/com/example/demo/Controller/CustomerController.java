package com.example.demo.Controller;


import com.example.demo.Models.Customer;
import com.example.demo.Services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

@RestController
@RequestMapping(value="Customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @RequestMapping(value = "CustomerData" ,method = RequestMethod.POST)
    public void createCustomer(@RequestParam String fName, String lName , String email, String phone) throws ParseException {
        customerService.createCustomer(fName, lName, email, phone);
    }


}
