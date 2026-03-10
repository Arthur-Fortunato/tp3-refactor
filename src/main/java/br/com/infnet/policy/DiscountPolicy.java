package br.com.infnet.policy;

public class DiscountPolicy {
    private static final double DISCOUNT_RATE = 0.1;

    public double calculateDiscount(double amount) {
        return amount * DISCOUNT_RATE;
    }

    public double calculateFinalTotal(double amount) {
        return amount - calculateDiscount(amount);
    }
}