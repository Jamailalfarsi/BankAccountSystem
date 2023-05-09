package com.example.demo.Controller;


import com.example.demo.Models.Account;
import com.example.demo.Models.Customer;
import com.example.demo.Services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @RequestMapping(value = "getAll",method = RequestMethod.GET)
    public List<Customer> getAllStudents() {
        List<Customer> customerList = customerService.getAllCustomers();
        return customerList;
    }

    @RequestMapping(value = "getById",method = RequestMethod.GET)
    public Customer getCustomerById(@RequestParam Integer id) {
        Customer customer = customerService.getCustomerById(id);
        return customer;
    }
    @RequestMapping(value = "updateCustomerInfo",method = RequestMethod.POST)
    public void updateCustomer(@RequestParam  Integer id,String email, String phone)throws ParseException {
        customerService.updateCustomer(id,email,phone);
    }

    @GetMapping(value = "deleteById")
    public String deleteCourseById(@RequestParam Integer id) {

        customerService.deleteCustomerById(id);
        return "Record Deleted Successfully :)";

    }




}
