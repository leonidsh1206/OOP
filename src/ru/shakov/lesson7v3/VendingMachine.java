package ru.shakov.lesson7v3;

import java.util.Scanner;

class VendingMachine {

    //Выводим приглашение "Воспользоваться" Автоматом
    public static void printInterface() {
        System.out.println("Выберите из меню: \n" +
                "0 - выйти из программы; \n" +
                "1 - вывести меню напитков; \n" +
                "2 - пополнить счет; \n" +
                "3 - выбрать напиток; \n" +
                "4 - получить напиток. \n");
    }

    public static void printMenu() {
        for (Drinks drinks:Drinks.values()) {
            System.out.println(drinks.getNumber() + " - "
                    + drinks.getTitle() + " - "
                    + drinks.getCost());

        }
        System.out.println();
    }

    static Scanner scanner = new Scanner(System.in);

    public static int inputIntWithCheck() {
        int choice = scanner.nextInt();
        return choice;
    }

    public static double inputDoubleWithCheck() {
        System.out.println("Введите сумму, которую хотите внести: ");
        double deposit = scanner.nextDouble();
        return deposit;
    }

    public static void drinkChoice() {
        System.out.println("Введите номер выбранного напитка: ");
        int numberOfDrink = 0;
        while (numberOfDrink <= 0 || numberOfDrink > 5 ) {          // прверяем корректность выбора номера напитка
            numberOfDrink = scanner.nextInt();
            if ((numberOfDrink <= 0 || numberOfDrink > 5)) {
                System.out.println("Выбран неверный номер напитка. Выберите снова");
            } else {
                System.out.println("Выбран напиток " + Drinks.returnTitle(numberOfDrink));
            }
        }
        System.out.println();
    }

    public static void drinkOut(double deposit) {
        if (deposit >= Drinks.costOfDrink) {
            deposit = deposit - Drinks.costOfDrink;
            System.out.println("Получите Ваш напиток " + Drinks.getChosenDrink());
            System.out.println("Остаток на счете " + deposit);
        } else {
            System.out.println("На счету не достаточно для покупки " +
                    "выбранного напитка " + Drinks.getChosenDrink() + ". Внесите еще: ");
        }
    }


    public static void main(String[] args) {
        int choice;
        double deposit = 0;
        do {
            printInterface();
            choice = inputIntWithCheck();
            switch (choice) {
                case 0:
                    //Выход из программы
                    return;
                case 1:
                    //Отображение меню напитков
                    printMenu();
                    break;
                case 2:
                    //Пополнение счёта
                    deposit += inputDoubleWithCheck();
                    System.out.println("На счету " + deposit);
                    System.out.println();
                    break;
                case 3:
                    //Выбор напитка
                    drinkChoice();
                    break;
                case 4:
                    // Получение напитка и вывод остатка на счете
                    drinkOut(deposit);
                    break;
                default:
            }
        } while (true);
    }
}
