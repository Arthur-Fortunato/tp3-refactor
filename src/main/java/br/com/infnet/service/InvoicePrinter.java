package br.com.infnet.service;

import br.com.infnet.entity.Item;
import br.com.infnet.entity.Order;

public class InvoicePrinter {
    private OrderCalculator calculator = new OrderCalculator();

    public void print(Order order) {
        System.out.println("Cliente: " + order.getClient().getClientName());
        for (Item item : order.getItems()) {
            System.out.println(item.getQuantity() + "x " + item.getProduct() + " - R$" + item.getPrice());
        }

        double total = order.calculateTotal();
        double discount = calculator.calculateDiscount(total);
        double finalTotal = calculator.calculateFinalTotal(total);

        System.out.println("Subtotal: R$" + total);
        System.out.println("Desconto: R$" + discount);
        System.out.println("Total final: R$" + finalTotal);
    }
}