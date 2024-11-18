package main.java.com.commands;

import main.java.com.models.Supplier;
import main.java.com.utils.SupplierStorage;

import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class AddSupplierCommand implements Command {

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Додавання нового постачальника:");
        System.out.print("Введіть ім'я постачальника: ");
        String name = scanner.nextLine();

        System.out.print("Введіть номер телефону: ");
        String phone = scanner.nextLine();

        System.out.print("Введіть email: ");
        String email = scanner.nextLine();

        Supplier newSupplier = new Supplier(UUID.randomUUID().toString(), name, phone, email);

        List<Supplier> suppliers = SupplierStorage.loadSuppliers();

        suppliers.add(newSupplier);

        SupplierStorage.saveSuppliers(suppliers);

        System.out.println("Постачальника успішно додано: " + newSupplier);
    }
}
