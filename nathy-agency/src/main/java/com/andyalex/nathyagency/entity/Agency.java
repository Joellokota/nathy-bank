package com.andyalex.nathyagency.entity;

import jakarta.persistence.*;
import lombok.*;

@Builder @Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="agency_bank")
@Entity
public class Agency {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String address;
    private String phone;
    private String email;
    private String city;
    private String state;
    private String country;
    private String zip;
    private String description;
    private String agencyNumber;
}
