package br.com.infnet.policy;

public class DiscountPolicy {
    public double calculateDiscount(double amount, double rate) {
        return amount * rate;
    }
}
