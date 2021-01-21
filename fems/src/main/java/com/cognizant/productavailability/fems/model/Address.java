package com.cognizant.productavailability.fems.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Address {
    private Long id;
    private String street;
    private String city;
    private String state;
    private String country;
    private String zipCode;
}
