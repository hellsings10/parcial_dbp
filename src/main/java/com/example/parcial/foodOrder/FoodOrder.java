package com.example.parcial.foodOrder;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

@Entity
@Getter
@Setter
public class FoodOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long customerId;
    private Long productId;
    private Integer quantity;
    private BigDecimal totalAmount;
    private ZonedDateTime createdAt;
    private String status;

    public FoodOrder() {
    }

    public FoodOrder(Long id, Long customerId, Long productId, Integer quantity, BigDecimal totalAmount, ZonedDateTime createdAt, String status) {
        this.id = id;
        this.customerId = customerId;
        this.productId = productId;
        this.quantity = quantity;
        this.totalAmount = totalAmount;
        this.createdAt = createdAt;
        this.status = status;
    }
}
