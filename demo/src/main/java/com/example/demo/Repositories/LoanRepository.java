package com.example.demo.Repositories;

import com.example.demo.Models.Customer;
import com.example.demo.Models.Loan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanRepository extends CrudRepository<Loan,Integer> {
}
