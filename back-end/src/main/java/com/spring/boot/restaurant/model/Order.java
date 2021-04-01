package com.spring.boot.restaurant.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orderfoods")
public class Order extends CategoryOrder {

    @Column(name = "image")
    private String img;
    @Column(name = "price")
    private int price;
    @Column(name = "description")
    private String description;
}
