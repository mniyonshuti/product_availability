package com.cognizant.productavailability.fems.model;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class ProductDTO {
    private Long productId;
    private String name;
    private List<LocationDTO> locations;
    private String imageUrl;
    private String description;
}
