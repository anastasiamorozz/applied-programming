package main.java.com.commands;

import main.java.com.models.Coffee;
import main.java.com.utils.CoffeeStorage;

import java.util.List;

public class ViewCoffeeCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Перегляд кави в фургоні...");

        List<Coffee> coffeeList = CoffeeStorage.loadCoffeeItems();

        if (coffeeList.isEmpty()) {
            System.out.println("Фургон порожній. Додайте каву.");
        } else {
            System.out.println("Список кави у фургоні:");
            for (Coffee coffee : coffeeList) {
                System.out.println(coffee);
            }
        }
    }
}
