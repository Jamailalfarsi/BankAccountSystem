package com.example.demo.Controller;

import com.example.demo.Services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

@RestController
@RequestMapping(value="Account")
public class AccountController {
    @Autowired
    AccountService accountService;
    @RequestMapping(value = "AccountData" ,method = RequestMethod.POST)
    public void createAccountData(@RequestParam Integer accountNumber,Double balance ) throws ParseException {
        accountService.createAccountData(accountNumber,balance);
    }

}
