package com.example.demo.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Customer extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String firstName;
    String lastName;
    String email;
    String phone;

    @ManyToOne
    @JoinColumn(name = "account_id", referencedColumnName = "id")// defining the foreign key which is ID
    Account account;
}
