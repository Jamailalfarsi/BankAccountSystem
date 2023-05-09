package com.example.demo.Controller;

import com.example.demo.Models.Customer;
import com.example.demo.Models.Loan;
import com.example.demo.Repositories.LoanRepository;
import com.example.demo.Services.CustomerService;
import com.example.demo.Services.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping(value="Loan")
public class LoanController {

        @Autowired
        LoanService loanService;
        @RequestMapping(value = "LoanTableData" ,method = RequestMethod.POST)
        public void createLoanTable(@RequestParam Double amount,Double rate,String createdDate,String updatedDate, Boolean isActive) throws ParseException {
            loanService.createLoanTable(amount, rate,createdDate,updatedDate,isActive);
        }
        @RequestMapping(value = "getAll",method = RequestMethod.GET)
        public List<Loan> getAllLoans() {
                List<Loan> loanList = loanService.getAllLoans();
                return loanList;
        }
        @RequestMapping(value = "getById",method = RequestMethod.GET)
        public Loan getLoanById(@RequestParam Integer id) {
                Loan loan = loanService.getLoanById(id);
                return loan;
        }

}
