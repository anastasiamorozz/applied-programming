package main.java.com.commands;

import main.java.com.models.Coffee;
import main.java.com.utils.CoffeeStorage;

import java.util.List;
import java.util.Scanner;

public class LoadTruckCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Завантаження фургона кавою...");

        List<Coffee> coffeeList = CoffeeStorage.loadCoffeeItems();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Скільки видів кави ви хочете додати до фургону? ");
        int count;

        try {
            count = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Некоректний ввід. Спробуйте ще раз.");
            return;
        }

        for (int i = 1; i <= count; i++) {
            System.out.println("Додаємо вид кави #" + i);

            System.out.print("Введіть ID кави: ");
            String coffeeId = scanner.nextLine();

            System.out.print("Введіть назву кави: ");
            String title = scanner.nextLine();

            System.out.print("Введіть категорію кави (зернова, мелена, розчинна): ");
            String category = scanner.nextLine();

            System.out.print("Введіть країну походження кави: ");
            String country = scanner.nextLine();

            Coffee newCoffee = new Coffee(coffeeId, title, category, country);
            coffeeList.add(newCoffee);

            System.out.println("Кава успішно додана: " + newCoffee);
        }

        CoffeeStorage.saveCoffeeItems(coffeeList);
        System.out.println("Фургон успішно завантажено кавою!");
    }
}
