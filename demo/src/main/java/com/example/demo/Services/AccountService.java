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

    public Account getAccountBalance(Double balance) {
        return accountRepository.getAccountBalance(balance);

    }

    public void deleteAccountById(Integer id) {
        Account accountToDelete = accountRepository.findById(id).get();
        accountRepository.delete(accountToDelete);
    }


    //    public String UpdateAccountBalanceWhenTransactionMade() throws FileNotFoundException, JRException {
//        List<Account> accountList = accountRepository.getAccountBalance();
//        List<Transaction> transactionList = transactionRepository.getAllTransactions();
//
//        List<StudentDTO> studentDTOList = new ArrayList<>();
//        for (Student std : studentList) {
//            String schoolName = std.getSchool().getName();
//            String studentName = std.getName();
//            Integer studentAge = std.getAge();
//
//            StudentDTO studentDTO = new StudentDTO(schoolName, studentName, studentAge);
//            studentDTOList.add(studentDTO);
//
//        }
//    public Account getCalculateInterestOnAccountBalance() {
//        List<Account> accountList = accountRepository.getAllAccounts();
//        for (Account account : accountList) {
//            Double balanceAccount=account.getBalance();
//            Double interestAccount=0.25*balanceAccount;
//            account.getInterest();
//            accountRepository.save(account);
//
//        }
//    }

    public void updateAccount(Integer id,Integer accountNumber, Double balance){
        Account account =accountRepository.getAccountById(id);
        account.setAccountNumber(accountNumber);
        account.setBalance(balance);
        accountRepository.save(account);
    }
}
