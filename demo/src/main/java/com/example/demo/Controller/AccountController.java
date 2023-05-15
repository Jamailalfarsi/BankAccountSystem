package com.example.demo.Controller;

import com.example.demo.Models.Account;
import com.example.demo.Models.Customer;
import com.example.demo.Services.AccountService;
import org.eclipse.jdt.internal.compiler.env.IBinaryType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping(value="Account")
public class AccountController {
    @Autowired
    AccountService accountService;

    @RequestMapping(value = "AccountData" ,method = RequestMethod.POST)
    public void createAccountData(@RequestParam Integer accountNumber, Double balance, String createdDate, String updatedDate, Boolean isActive, Integer customerId) throws ParseException {
        accountService.createAccountData(accountNumber,balance,createdDate,updatedDate,isActive,customerId);
        }
    @RequestMapping(value = "getAll",method = RequestMethod.GET)
    public List<Account> getAllAccounts(){
        List<Account> accountList = accountService.getAllAccounts();
        return accountList;
    }
    @RequestMapping(value = "getById",method = RequestMethod.GET)
    public Account getAccountById(@RequestParam Integer id) {
        Account account = accountService.getAccountById(id);
        return account;
    }
    @RequestMapping(value = "getByBalance",method = RequestMethod.GET)
    public Account getAccountBalance(@RequestParam Double balance) {
        Account account = accountService.getAccountBalance(balance);
        return account;
    }
    @GetMapping(value = "deleteById")
    public String deleteAccountById(@RequestParam Integer id) {

        accountService.deleteAccountById(id);
        return "Record Deleted Successfully :)";

    }
    @RequestMapping(value = "updateAccountInfo",method = RequestMethod.POST)
    public void updateAccount(@RequestParam  Integer id,Integer accountNumber, Double balance)throws ParseException {
        accountService.updateAccount(id,accountNumber,balance);
    }







}
