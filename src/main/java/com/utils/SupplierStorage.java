package main.java.com.utils;

import main.java.com.models.Supplier;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SupplierStorage {

    private static final String FILE_NAME = "suppliers.dat";

    public static List<Supplier> loadSuppliers() {
        List<Supplier> suppliers = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            suppliers = (List<Supplier>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Файл постачальників ще не створено.");
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Помилка під час завантаження постачальників: " + e.getMessage());
        }
        return suppliers;
    }

    public static void saveSuppliers(List<Supplier> suppliers) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(suppliers);
        } catch (IOException e) {
            System.err.println("Помилка під час збереження постачальників: " + e.getMessage());
        }
    }
}
