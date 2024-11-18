package main.java.com.models;

import java.io.Serializable;
import java.util.Date;

public class Order implements Serializable {
    private String orderId;
    private String itemId;
    private String customerId;
    private Date date;
    private double totalPrice;

    public Order(String orderId, String itemId, String customerId, Date date, double totalPrice) {
        this.orderId = orderId;
        this.itemId = itemId;
        this.customerId = customerId;
        this.date = date;
        this.totalPrice = totalPrice;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getItemId() {
        return itemId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public Date getDate() {
        return date;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "ID='" + orderId + '\'' +
                ", Item ID='" + itemId + '\'' +
                ", Customer ID='" + customerId + '\'' +
                ", Дата=" + date +
                ", Загальна ціна=" + totalPrice +
                '}';
    }
}
