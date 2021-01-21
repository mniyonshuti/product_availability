package com.cognizant.productavailability.fems.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Data
public class Product {
    private Long id;
    private Long productId;
    private String name;
    private Long locationId;
    private int quantity;
    private String imageUrl;
    private String description;
}
