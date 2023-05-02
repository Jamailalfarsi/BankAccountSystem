package com.example.demo.Repositories;

import com.example.demo.Models.Account;
import com.example.demo.Models.CreditCard;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CreditCardRepository extends CrudRepository<CreditCard,Integer> {
    @Query(value = "SELECT s from CreditCard s")
    List<CreditCard> getAllCreditCards();
}
