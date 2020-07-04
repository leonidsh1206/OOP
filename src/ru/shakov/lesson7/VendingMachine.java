package ru.shakov.lesson7;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {

        // Выводим меню напитков
        Drinks.printInterface();

        // Выбираем номер напитка
        System.out.println("Выберите номер напитка, который хотите купить: ");
        int numberOfDrink = 0;
        while (numberOfDrink <= 0 || numberOfDrink > 5 ) {          // прверяем корректность выбора номера напитка
            Scanner scanner = new Scanner(System.in);
            numberOfDrink = scanner.nextInt();
            if ((numberOfDrink <= 0 || numberOfDrink > 5)) {
                System.out.println("Выбран неверный номер напитка. Выберите снова");
            } else {
                System.out.println("Выбран напиток " + Drinks.returnTitle(numberOfDrink));
            }
        }

        //Вносим на счет сумму
        System.out.println("Введите сумму, которую хотите внести: ");

        int depositToAccount = 0;
        while (depositToAccount < Drinks.costOfDrink) {        // прверяем, внесена ли необходимая сумма
            Scanner scanner = new Scanner(System.in);
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
