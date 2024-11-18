package main.java.com.menu;

import main.java.com.commands.Command;

import java.util.HashMap;
import java.util.Map;

public class Menu {
    private final Map<Integer, Command> commands = new HashMap<>();

    public void setCommand(int option, Command command) {
        commands.put(option, command);
    }

    public void showMenu() {
        System.out.println("Меню:");
        System.out.println("1. Завантажити фургон кавою");
        System.out.println("2. Переглянути каву в фургоні");
        System.out.println("3. Редагувати дані про каву в фургоні");
        System.out.println("4. Дозамовити каву у постачальника");
        System.out.println("5. Додати нового постачальника");
        System.out.println("0. Вихід");
    }

    public void selectOption(int option) {
        Command command = commands.get(option);
        if (command != null) {
            command.execute();
        } else {
            System.out.println("Невірний вибір.");
        }
    }
}
