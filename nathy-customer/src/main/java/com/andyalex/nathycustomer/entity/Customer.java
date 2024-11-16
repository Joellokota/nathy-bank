package com.andyalex.nathycustomer.entity;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Builder @Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "CUSTOMER")
@Entity
public class Customer {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    private String phone;
    private String email;
    private String lastName;
    private String firstName;
    private String gender;
    private LocalDate birthDate;
    private String customerNumber;
}
