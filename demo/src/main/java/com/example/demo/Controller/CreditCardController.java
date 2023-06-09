package com.example.demo.Controller;

import com.example.demo.Models.Account;
import com.example.demo.Models.CreditCard;
import com.example.demo.Repositories.AccountRepository;
import com.example.demo.Repositories.CreditCardRepository;
import com.example.demo.Services.CreditCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping(value="CreditCard")
public class CreditCardController {
    @Autowired
    CreditCardService creditCardService;


    @RequestMapping(value = "CreditCardData", method = RequestMethod.POST)
    public void createCreditCardData(@RequestParam Integer cardNum,String createdDate,String updatedDate, Boolean isActive) throws ParseException {
        creditCardService.createCreditCardData(cardNum,createdDate,updatedDate,isActive);
    }
    @RequestMapping(value = "getAll",method = RequestMethod.GET)
    public List<CreditCard> getAllCreditCards(){
        List<CreditCard> creditCardList = creditCardService.getAllCreditCards();
        return creditCardList;
    }

//    @RequestMapping(value = "getById")
//    public CreditCard getCreditCardById(@RequestParam Integer id) {
//        CreditCard creditCard =creditCardService.getCreditCardById(id);
//        return creditCard;
//    }
@RequestMapping(value = "getAllCreditCardByIsActive",method = RequestMethod.GET)
public List<CreditCard> getAllActiveCreditCards() {
    List<CreditCard> activeCreditCardsList = creditCardService.getAllActiveCreditCards();
    return activeCreditCardsList;
}
    @RequestMapping(value = "getAllCreditCardByIsInActive",method = RequestMethod.GET)
    public List<CreditCard> getAllInActiveCreditCards() {
        List<CreditCard> activeCreditCardsList = creditCardService.getAllInActiveCreditCards();
        return activeCreditCardsList;
    }
    @GetMapping(value = "deleteById")
    public String deleteCreditCardById(@RequestParam Integer id) {

        creditCardService.deleteCreditCardById(id);
        return "Record Deleted Successfully :)";

    }
}
