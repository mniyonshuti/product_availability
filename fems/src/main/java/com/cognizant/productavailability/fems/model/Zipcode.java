package com.cognizant.productavailability.fems.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Data
public class Zipcode {
    int adminCode2;
    String adminCode1;
    String adminName2;
    double lng;
    double distance;
    String countryCode;
    int postalCode;
    String adminName1;
    String placeName;
    double lat;
}
