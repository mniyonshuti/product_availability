package com.cognizant.productavailability.locationcrud.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class LocationDTO {
    private Long locationId;
    private String locationName;
    private Address address;
}
