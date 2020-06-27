package ru.shakov.lesson7;

import java.util.Arrays;

public class VendingMachine {
    public static void main(String[] args) {

        Drinks[] drinks = Drinks.values();          // Выводим меню напитков
        System.out.println(Arrays.toString(drinks));

        // TODO Необходимо проработать взаимодействие автомата с пользователем

        // Допустим, клиент client вносит на счет сумму 100
        Client client = new Client(150);
        System.out.println(client.depositToAccount);

        // Допустим, выбираем напиток COFFEE
        System.out.println(Drinks.COFFEE);      // Выводим на экран выбранный напиток

        System.out.println(Drinks.COFFEE.getCost());

        if (client.depositToAccount == 0) {
            System.out.println("Вы не внесли деньги");  // ситуация если пользователь не внем деньги
        } else {
            if (client.depositToAccount <= Drinks.COFFEE.getCost()) {
                System.out.println("На счету недостаточно средств для покупки данного напитка");    // пользоватлеь выбрал более дорогой напиток
            } else {
                int lostMoney = client.depositToAccount - Drinks.COFFEE.getCost();
                System.out.printf("Вот ваш напиток. На счету осталось %d денег", lostMoney);    // автомат выдает напиток и высчитывает остаток
            }
        }

        // TODO Необходимо предусмотреть ситуацию, когда пользователь выбрал неуществующий напиток

    }

}
