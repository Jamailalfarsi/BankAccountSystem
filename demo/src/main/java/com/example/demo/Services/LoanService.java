package com.example.demo.Services;

import com.example.demo.Models.Customer;
import com.example.demo.Models.Loan;
import com.example.demo.Repositories.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanService {
    @Autowired
    LoanRepository loanRepository;
    public void  createLoanTable(Double amount,Double rate,String createdDate,String updatedDate, Boolean isActive) {
        Loan loan=new Loan();
        loan.setAmount(amount);
        loan.setRate(rate);
        loan.setCreatedDate(createdDate);
        loan.setUpdatedDate(updatedDate);
        loan.setIsActive(isActive);
        loanRepository.save(loan);
    }
    public List<Loan> getAllLoans(){
        return loanRepository.getAllLoans();
    }

    public Loan getLoanById(Integer id){
        return  loanRepository.getLoanById(id);
    }
    public void deleteLoanById(Integer id){
        Loan loanToDelete = loanRepository.findById(id).get();
        loanRepository.delete(loanToDelete);
    }
}
