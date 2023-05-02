package com.example.demo.Services;

import com.example.demo.Models.Account;
import com.example.demo.Models.Customer;
import com.example.demo.Models.Loan;
import com.example.demo.Repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    @Autowired
    AccountRepository accountRepository;
    public void  createAccountData(Integer accountNum, Double balance,String createdDate,String updatedDate, Boolean isActive) {
        Account account=new Account();
        account.setAccountNumber(accountNum);
        account.setBalance(balance);
        account.setCreatedDate(createdDate);
        account.setUpdatedDate(updatedDate);
        account.setIsActive(isActive);
        accountRepository.save(account);
    }

    public List<Account> getAllAccounts(){
        return accountRepository.getAllAccounts();
    }
}
