package com.example.demo.Services;

import com.example.demo.Repositories.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoanService {
    @Autowired
    LoanRepository loanRepository;
}
