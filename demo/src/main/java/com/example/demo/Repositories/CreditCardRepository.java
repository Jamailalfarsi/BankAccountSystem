package com.example.demo.Repositories;

import com.example.demo.Models.Account;
import com.example.demo.Models.CreditCard;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditCardRepository extends CrudRepository<CreditCard,Integer> {
}
