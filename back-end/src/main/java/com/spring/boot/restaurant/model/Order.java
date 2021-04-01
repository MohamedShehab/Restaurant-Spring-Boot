package com.spring.boot.restaurant.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order extends CategoryOrder {

    private String img;
    private int price;
    private String description;
}
