package com.example.demo.RequestObject;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class AccountRequest {
    Double balance;
    Integer accountNumber;
    String phone;
    Boolean isActive;
}
