package com.example.demo.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Loan extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    Double amount;
    Double rate;
    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "id")// defining the foreign key which is ID
    Customer customer;
}
