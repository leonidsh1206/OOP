package ru.shakov.lesson6;

public class Client extends Human {
    private int accountNumber;
    private double sumOnAccount;

    // конструктор для создания новых клиентов
    public Client(int accountNumber, double sumOnAccount, int passportNumber) {
        super(passportNumber);
        this.accountNumber = accountNumber;
        this.sumOnAccount = sumOnAccount;
    }

}
