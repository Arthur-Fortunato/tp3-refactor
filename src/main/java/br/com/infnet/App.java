package br.com.infnet;

import br.com.infnet.entity.Client;
import br.com.infnet.entity.Item;
import br.com.infnet.entity.Order;
import br.com.infnet.service.EmailService;
import br.com.infnet.service.InvoicePrinter;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Client client = new Client("João","joao@email.com");

        List<Item> items = new ArrayList<>();

        Item notebook = new Item("Notebook", 3500.0, 1);
        Item mouse = new Item("Mouse", 80.0, 2);

        items.add(notebook);
        items.add(mouse);

        Order order = new Order(client, items);

        InvoicePrinter printer = new InvoicePrinter();
        EmailService  emailService = new EmailService();

        printer.print(order);
        emailService.sendEmail(client.getClientName(),"Pedido recebido! Obrigado pela compra.");
    }
}
