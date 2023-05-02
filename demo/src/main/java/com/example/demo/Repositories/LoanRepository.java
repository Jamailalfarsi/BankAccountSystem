package com.example.demo.Repositories;

import com.example.demo.Models.Customer;
import com.example.demo.Models.Loan;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoanRepository extends CrudRepository<Loan,Integer> {
    @Query(value="SELECT s from Loan s")
    List<Loan> getAllLoans();
}
