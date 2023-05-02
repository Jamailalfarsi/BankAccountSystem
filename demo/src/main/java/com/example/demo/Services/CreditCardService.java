package com.example.demo.Services;

import com.example.demo.Models.Account;
import com.example.demo.Models.CreditCard;
import com.example.demo.Repositories.CreditCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreditCardService {
    @Autowired
    CreditCardRepository creditCardRepository;
    public void  createCreditCardData(Integer cardNum, String createdDate,String updatedDate, Boolean isActive ) {
        CreditCard creditCard=new CreditCard();
        creditCard.setCardNumber(cardNum);
        creditCard.setCreatedDate(createdDate);
        creditCard.setUpdatedDate(updatedDate);
        creditCard.setIsActive(isActive);
        creditCardRepository.save(creditCard);
    }
    public List<CreditCard> getAllCreditCards(){
        return creditCardRepository.getAllCreditCards();
    }
//    public  CreditCard getCreditCardById(Integer id){
//        return  creditCardRepository.getCreditCardById(id);
//
//    }
}
