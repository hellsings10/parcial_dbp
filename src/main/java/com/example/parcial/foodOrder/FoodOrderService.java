package com.example.parcial.foodOrder;

public class FoodOrderService {
    private final FoodOrderRepository foodOrderRepository;

    public FoodOrderService(FoodOrderRepository foodOrderRepository) {
        this.foodOrderRepository = foodOrderRepository;
    }
}
