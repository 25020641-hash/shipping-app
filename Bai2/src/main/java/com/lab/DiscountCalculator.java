package com.lab;

public class DiscountCalculator {
    public double calculateDiscount(double amount) {
        return amount > 100 ? amount * 0.1 : 0;
    }
}
