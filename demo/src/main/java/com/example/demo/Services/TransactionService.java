package com.example.demo.Services;

import com.example.demo.Models.Loan;
import com.example.demo.Models.Transaction;
import com.example.demo.Repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {
    @Autowired
    TransactionRepository transactionRepository;
    public void  createTransactionTable(Double amount,String transactionDate ,String createdDate,String updatedDate, Boolean isActive) {
        Transaction transaction=new Transaction();
        transaction.setAmount(amount);
        transaction.setTransactionDate(transactionDate);
        transaction.setCreatedDate(createdDate);
        transaction.setUpdatedDate(updatedDate);
        transaction.setIsActive(isActive);
        transactionRepository.save(transaction);
    }
    public List<Transaction> getAllTransactions(){
        return transactionRepository.getAllTransactions();
    }
//    public Transaction getTransactionById(Integer id){
//        return  transactionRepository.getTransactionById(id);
//    }

}
