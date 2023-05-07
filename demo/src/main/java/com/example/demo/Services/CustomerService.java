package com.example.demo.Services;

import com.example.demo.Models.Account;
import com.example.demo.Models.Customer;
import com.example.demo.Repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;
    public void  createCustomer(String fName,String lName ,String email,String phone,String createdDate,String updatedDate, Boolean isActive) {
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
    public List<Customer> getAllCustomers(){

        return customerRepository.getAllCustomers();
    }

    public Customer getCustomerById(Integer id){
        return  customerRepository.getCustomerById(id);

    }

//    public List<Customer> getByCustomerFirstName(String fName) {
//        return customerRepository.getByCustomerFirstName(fName);
//    }
public void updateCustomer(Integer id,String email, String phone){
    Customer customer =customerRepository.getCustomerById(id);
    customer.setEmail(email);
    customer.setPhone(phone);
    customerRepository.save(customer);
}
    public void deleteCustomerById(Integer id){
        Customer customer = customerRepository.deleteCustomerById(id);
        customer.setIsActive(false);
        customerRepository.save(customer);
    }

}
