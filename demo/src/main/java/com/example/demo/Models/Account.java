package com.example.demo.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    Integer accountNumber;
    Double balance;

    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "id")// defining the foreign key which is ID
    Customer customer;
}
