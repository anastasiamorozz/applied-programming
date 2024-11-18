package main.java.com;

import main.java.com.commands.EditCoffeeDataCommand;
import main.java.com.commands.LoadTruckCommand;
import main.java.com.commands.ReorderCoffeeCommand;
import main.java.com.commands.ViewCoffeeCommand;
import main.java.com.menu.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.setCommand(1, new LoadTruckCommand());
        menu.setCommand(2, new ViewCoffeeCommand());
        menu.setCommand(3, new EditCoffeeDataCommand());
        menu.setCommand(4, new ReorderCoffeeCommand());

        Scanner scanner = new Scanner(System.in);
        int option = -1;

        while (option != 0) {
            menu.showMenu();
            System.out.print("Введіть ваш вибір: ");
            option = scanner.nextInt();
            if (option != 0) {
                menu.selectOption(option);
            }
        }

        System.out.println("Вихід з програми.");
        scanner.close();

    }
}