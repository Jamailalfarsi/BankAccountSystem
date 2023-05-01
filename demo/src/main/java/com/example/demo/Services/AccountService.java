package com.example.demo.Services;

import com.example.demo.Models.Account;
import com.example.demo.Models.Customer;
import com.example.demo.Repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    @Autowired
    AccountRepository accountRepository;
    public void  createAccountData(Integer accountNum,Double balance) {
        Account account=new Account();
        account.setAccountNumber(accountNum);
        account.setBalance(balance);
        accountRepository.save(account);
    }
}
