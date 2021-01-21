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
public class Location {
    @Id
    private Long locationId;
    private String locationName;
    private Long locationAddressId;
}
