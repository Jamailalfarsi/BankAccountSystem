package com.example.demo.Controller;

import com.example.demo.Services.LoanService;
import com.example.demo.Services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

@RestController
@RequestMapping(value="Transaction")
public class TransactionController {
    @Autowired
    TransactionService transactionService;
    @RequestMapping(value = "TransactionTableData" ,method = RequestMethod.POST)
    public void createTransactionTable(@RequestParam Double amount,String transactionDate ,String createdDate,String updatedDate, Boolean isActive) throws ParseException {
        transactionService.createTransactionTable(amount, transactionDate,createdDate,updatedDate,isActive);
    }
}
