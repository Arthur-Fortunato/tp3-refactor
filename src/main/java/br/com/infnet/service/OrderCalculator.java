package br.com.infnet.service;

public class OrderCalculator {
    private static final double DISCOUNT_RATE = 0.1;

    public double calculateDiscount(double total) {
        return total * DISCOUNT_RATE;
    }

    public double calculateFinalTotal(double total) {
        return total - calculateDiscount(total);
    }
}