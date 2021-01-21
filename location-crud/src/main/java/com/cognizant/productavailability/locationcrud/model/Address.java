package com.cognizant.productavailability.locationcrud.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Address {
    @Id
    private Long id;
    private String street;
    private String city;
    private String state;
    private String country;
    private String zipCode;
}
