package com.example.demo.Controller;

import com.example.demo.Repositories.AccountRepository;
import com.example.demo.Repositories.CreditCardRepository;
import com.example.demo.Services.CreditCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

@RestController
@RequestMapping(value="CreditCard")
public class CreditCardController {
    @Autowired
    CreditCardService creditCardService;


    @RequestMapping(value = "CreditCardData", method = RequestMethod.POST)
    public void createCreditCardData(@RequestParam Integer cardNum) throws ParseException {
        creditCardService.createCreditCardData(cardNum);
    }
}
