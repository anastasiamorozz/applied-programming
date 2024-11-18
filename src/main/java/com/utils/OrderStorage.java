package main.java.com.utils;

import main.java.com.models.Order;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class OrderStorage {
    private static final String FILE_PATH = "orders_storage.ser";

    public static void saveOrder(Order order) {
        List<Order> orders = loadOrders();
        orders.add(order);
        saveOrdersToFile(orders);
    }

    public static List<Order> loadOrders() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            return (List<Order>) ois.readObject();
        } catch (FileNotFoundException e) {
            return new ArrayList<>();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    private static void saveOrdersToFile(List<Order> orders) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            oos.writeObject(orders);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
