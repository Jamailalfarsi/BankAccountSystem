package com.example.demo.Services;

import com.example.demo.Models.Account;
import com.example.demo.Models.CreditCard;
import com.example.demo.Repositories.CreditCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreditCardService {
    @Autowired
    CreditCardRepository creditCardRepository;
    public void  createCreditCardData(Integer cardNum ) {
        CreditCard creditCard=new CreditCard();
        creditCard.setCardNumber(cardNum);
        creditCardRepository.save(creditCard);
    }
}
