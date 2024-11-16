package com.andyalex.nathyaccount.entity;

import jakarta.persistence.*;
import lombok.*;

@Builder @Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity @Table(name = "account_bank")
public class AccountBank {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String accountNumber;
    private String bankName;
    private String bankAccountNumber;
    private String bankAccountType;
}
