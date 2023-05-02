package com.example.demo.Repositories;

import com.example.demo.Models.Customer;
import com.example.demo.Models.Loan;
import com.example.demo.Models.Transaction;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends CrudRepository<Transaction,Integer> {
    @Query(value="SELECT s from Transaction s")
    List<Transaction> getAllTransactions();

}
