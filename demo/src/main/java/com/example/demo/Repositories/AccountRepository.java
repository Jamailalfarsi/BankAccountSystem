package com.example.demo.Repositories;

import com.example.demo.Models.Account;
import com.example.demo.Models.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends CrudRepository <Account,Integer>{
    @Query(value = "SELECT s from Account s")
    List<Account> getAllAccounts();

    @Query (value = "SELECT s from Account s where s.id = :id")
    Account getAccountById(@Param("id")Integer id);
    @Query (value = "SELECT s from Account s where s.balance = :balance")
    Account getAccountBalance(@Param("balance")Double balance);


}
