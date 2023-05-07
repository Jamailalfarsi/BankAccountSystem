package com.example.demo.Services;

import com.example.demo.Models.Account;
import com.example.demo.Models.Customer;
import com.example.demo.Models.Loan;
import com.example.demo.Models.Transaction;
import com.example.demo.Repositories.AccountRepository;
import com.example.demo.Repositories.TransactionRepository;
import net.sf.jasperreports.engine.JRException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Service
public class AccountService {
    @Autowired
    AccountRepository accountRepository;
    @Autowired
    TransactionRepository transactionRepository;

    public void createAccountData(Integer accountNum, Double balance, String createdDate, String updatedDate, Boolean isActive) {
        Account account = new Account();
        account.setAccountNumber(accountNum);
        account.setBalance(balance);
        account.setCreatedDate(createdDate);
        account.setUpdatedDate(updatedDate);
        account.setIsActive(isActive);
        accountRepository.save(account);
    }

    public List<Account> getAllAccounts() {
        return accountRepository.getAllAccounts();
    }

    public Account getAccountById(Integer id) {
        return accountRepository.getAccountById(id);

    }

//    public String UpdateAccountBalanceWhenTransactionMade() throws FileNotFoundException, JRException {
//        Account accountBalance= accountRepository.getAccountById();
//        Transaction transaction=transactionRepository


//        for (Account account : accountList) {
//            Double balance = account.getBalance();
////            Integer balanceAccount = Repository.UpdateAccountBalanceWhenTransactionMade(balance);
////            accountList.add(new CourseAverageMarkDTO(courseName, averageMark));
//            accountRepository.save(account);
//        }


    //}


}
