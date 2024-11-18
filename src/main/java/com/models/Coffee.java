package main.java.com.models;

import java.io.Serializable;

public class Coffee implements Serializable {
    private String coffeeId;
    private String title;
    private String category;
    private String country;

    public Coffee(String coffeeId, String title, String category, String country) {
        this.coffeeId = coffeeId;
        this.title = title;
        this.category = category;
        this.country = country;
    }

    public String getCoffeeId() {
        return coffeeId;
    }

    public void setCoffeeId(String coffeeId) {
        this.coffeeId = coffeeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "coffeeId='" + coffeeId + '\'' +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
