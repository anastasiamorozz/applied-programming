package main.java.com.commands;

import main.java.com.models.Coffee;
import main.java.com.utils.CoffeeStorage;

import java.util.List;
import java.util.Scanner;

public class EditCoffeeDataCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Редагування даних про каву в фургоні...");

        List<Coffee> coffeeList = CoffeeStorage.loadCoffeeItems();

        if (coffeeList.isEmpty()) {
            System.out.println("Фургон порожній! Немає даних для редагування.");
            return;
        }

        System.out.println("Доступна кава:");
        for (Coffee coffee : coffeeList) {
            System.out.println(coffee);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ID кави для редагування: ");
        String coffeeId = scanner.nextLine();

        Coffee selectedCoffee = coffeeList.stream()
                .filter(coffee -> coffee.getCoffeeId().equals(coffeeId))
                .findFirst()
                .orElse(null);

        if (selectedCoffee == null) {
            System.out.println("Кава з таким ID не знайдена.");
            return;
        }

        System.out.println("Редагуємо каву: " + selectedCoffee);

        System.out.print("Нова назва (залиште порожнім для збереження поточної): ");
        String newTitle = scanner.nextLine();
        if (!newTitle.isEmpty()) {
            selectedCoffee.setTitle(newTitle);
        }

        System.out.print("Нова категорія (залиште порожнім для збереження поточної): ");
        String newCategory = scanner.nextLine();
        if (!newCategory.isEmpty()) {
            selectedCoffee.setCategory(newCategory);
        }

        System.out.print("Нова країна походження (залиште порожнім для збереження поточної): ");
        String newCountry = scanner.nextLine();
        if (!newCountry.isEmpty()) {
            selectedCoffee.setCountry(newCountry);
        }

        CoffeeStorage.saveCoffeeItems(coffeeList);
        System.out.println("Дані кави успішно оновлено!");
    }
}
