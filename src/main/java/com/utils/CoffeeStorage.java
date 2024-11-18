package main.java.com.utils;

import main.java.com.models.Coffee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CoffeeStorage {
    private static final String FILE_NAME = "coffee_data.ser";

    public static List<Coffee> loadCoffeeItems() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (List<Coffee>) ois.readObject();
        } catch (FileNotFoundException e) {
            return new ArrayList<>();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public static void saveCoffeeItems(List<Coffee> coffeeItems) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(coffeeItems);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
