package ru.shakov.lesson7;

public class Client {
    private int depositOnAccount;
    private int numberOfDrink;
    // метод для зачисления денег на счет клиента

    public Client(int numberOfDrink, int depositOnAccount) {
        this.numberOfDrink = numberOfDrink;
        this.depositOnAccount = depositOnAccount;
    }
}
