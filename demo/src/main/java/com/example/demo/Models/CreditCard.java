package com.example.demo.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class CreditCard extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    Integer cardNumber;
    Double payment;

    @OneToOne
    @JoinColumn(name = "account_id", referencedColumnName = "id")// defining the foreign key which is ID
    Account account;

}
