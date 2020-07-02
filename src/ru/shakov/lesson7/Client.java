package ru.shakov.lesson7;

public class Client {
    int depositOnAccount;
    int numberOfDrink;
    // метод для зачисления денег на счет клиента

    public Client(int numberOfDrink, int depositOnAccount) {
        this.numberOfDrink = numberOfDrink;
        this.depositOnAccount = depositOnAccount;
    }
}
