package com.example.demo.Services;

import com.example.demo.Models.Customer;
import com.example.demo.Repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;
    public void  createCustomer(String fName,String lName ,String email,String phone,Date createdDate,Date updatedDate, Boolean isActive) {
        Customer customer=new Customer();
        customer.setFirstName(fName);
        customer.setLastName(lName);
        customer.setEmail(email);
        customer.setPhone(phone);
        customer.setCreatedDate(createdDate);
        customer.setUpdatedDate(updatedDate);
        customer.setIsActive(isActive);

        customerRepository.save(customer);
    }
}
