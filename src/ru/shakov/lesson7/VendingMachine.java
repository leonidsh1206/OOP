package ru.shakov.lesson7;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                // Выводим меню напитков
                Drinks.printInterface();

                // Выбираем номер напитка
                System.out.print("Выберите номер напитка, который хотите купить, или введите любое другое число для выхода: ");
                int numberOfDrink = 0;
                while (numberOfDrink <= 0 || numberOfDrink > 5) { // проверяем корректность выбора номера напитка
                    numberOfDrink = scanner.nextInt();
                    if (0 < numberOfDrink && numberOfDrink < 5) {
                        System.out.println("Выбран напиток " + Drinks.returnTitle(numberOfDrink));
                    } else {
                        return;
                    }
                }

                // Вносим на счет сумму
                System.out.println("Введите сумму, которую хотите внести: ");
                int depositToAccount = 0;
                while (depositToAccount < Drinks.costOfDrink) { // проверяем, внесена ли необходимая сумма
                    depositToAccount += scanner.nextInt();
                    if (depositToAccount < Drinks.costOfDrink) {
                        System.out.println("Внесенная сумма " + depositToAccount + " недостаточна для оплаты выбранного напитка. Внесите еще:");
                    } else {
                        System.out.println("Получите Ваш напиток " + Drinks.returnTitle(numberOfDrink));
                        System.out.println("Остаток на Вашем счете " + (depositToAccount - Drinks.costOfDrink));
                    }
                }
                // Создаем нового клиента с номером номером выбранного напитка и с остатком от внесенной суммой
                Client client = new Client(numberOfDrink, (depositToAccount - Drinks.costOfDrink));
            }
        }
    }
}
