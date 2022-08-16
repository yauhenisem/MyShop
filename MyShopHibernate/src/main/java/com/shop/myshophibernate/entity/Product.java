package com.shop.myshophibernate.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import org.w3c.dom.Text;

import javax.persistence.*;


@Table(name = "product")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "description")
    private Text descriprtion;

    @Column(name = "price")
    private int price;

}
