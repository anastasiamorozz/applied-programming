package main.java.com.commands;

import main.java.com.models.Order;
import main.java.com.utils.OrderStorage;

import java.util.Date;
import java.util.Scanner;
import java.util.UUID;

public class ReorderCoffeeCommand implements Command {
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Дозамовлення кави у постачальника...");

        System.out.print("Введіть ID товару: ");
        String itemId = scanner.nextLine();

        System.out.print("Введіть ID постачальника: ");
        String customerId = scanner.nextLine();

        System.out.print("Введіть загальну суму замовлення: ");
        double totalPrice = scanner.nextDouble();

        String orderId = UUID.randomUUID().toString();
        Order order = new Order(orderId, itemId, customerId, new Date(), totalPrice);

        OrderStorage.saveOrder(order);
        System.out.println("Замовлення успішно створено: " + order);
    }
}
