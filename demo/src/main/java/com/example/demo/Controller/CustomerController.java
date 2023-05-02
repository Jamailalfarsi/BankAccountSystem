package com.example.demo.Controller;


import com.example.demo.Models.Account;
import com.example.demo.Models.Customer;
import com.example.demo.Services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value="Customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @RequestMapping(value = "CustomerData" ,method = RequestMethod.POST)
    public void createCustomer(@RequestParam String fName, String lName , String email, String phone, String createdDate, String updatedDate, Boolean isActive) throws ParseException {
        customerService.createCustomer(fName, lName, email, phone,createdDate,updatedDate,isActive);
    }
    @RequestMapping(value = "getAll")
    public List<Customer> getAllStudents() {
        List<Customer> customerList = customerService.getAllCustomers();
        return customerList;
    }

    @RequestMapping(value = "getById")
    public Customer getCustomerById(@RequestParam Integer id) {
        Customer customer = customerService.getCustomerById(id);
        return customer;
    }



}
