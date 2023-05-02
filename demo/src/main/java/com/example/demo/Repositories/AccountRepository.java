package com.example.demo.Repositories;

import com.example.demo.Models.Account;
import com.example.demo.Models.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends CrudRepository <Account,Integer>{
    

}
