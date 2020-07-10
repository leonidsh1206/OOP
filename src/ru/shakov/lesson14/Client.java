package ru.shakov.lesson14;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Client {

    // Задаем Logger
    private static final Logger log = LogManager.getLogger(Client.class);

    private int depositOnAccount;
    private int numberOfDrink;

    public Client(int numberOfDrink, int depositOnAccount) {
        this.numberOfDrink = numberOfDrink;
        this.depositOnAccount = depositOnAccount;

        // Показываем сколько осталось на счете клиента
        log.info("Остаток на счете клиента {}", depositOnAccount);
    }
}
