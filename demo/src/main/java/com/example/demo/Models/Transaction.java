package com.example.demo.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@Data
@Table(name="TransactionAccount")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    Double amount;
    Date transactionDate;
    @ManyToOne
    @JoinColumn(name = "account_id", referencedColumnName = "id")// defining the foreign key which is ID
    Account account;
}
