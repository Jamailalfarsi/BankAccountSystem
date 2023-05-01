package com.example.demo.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
@Getter
@Setter
public class Account extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    Integer accountNumber;
    Double balance;

    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "id")// defining the foreign key which is ID
    Customer customer;
}
