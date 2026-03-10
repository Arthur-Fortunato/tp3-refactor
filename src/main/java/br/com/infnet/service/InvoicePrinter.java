package br.com.infnet.service;

import br.com.infnet.entity.Item;
import br.com.infnet.entity.Order;
import br.com.infnet.policy.DiscountPolicy;

public class InvoicePrinter {
    private DiscountPolicy discountPolicy = new DiscountPolicy();

    public void print(Order order) {
        System.out.println("Cliente: " + order.getClient().getClientName());

        for (Item item : order.getItems()) {
            System.out.println(item.getQuantity() + "x " + item.getProduct() + " - R$" + item.getPrice());
        }

        double total = order.calculateTotal();
        double discount = discountPolicy.calculateDiscount(total);
        double finalTotal = discountPolicy.calculateFinalTotal(total);

        System.out.println("Subtotal: R$" + total);
        System.out.println("Desconto: R$" + discount);
        System.out.println("Total final: R$" + finalTotal);
    }
}