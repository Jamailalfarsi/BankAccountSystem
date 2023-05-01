package com.example.demo.Repositories;

import com.example.demo.Models.Loan;
import com.example.demo.Models.Transaction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends CrudRepository<Transaction,Integer> {

}
