package ru.shakov.lesson8.part3;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Contract contract = new Contract(123, LocalDate.of(2020,7,2), new String[] {"Position1", "Position2"});

        System.out.printf("%s%n", contract);

        // следующий код необходимо вынести в отдельный сласс с методом,
        // который будет конвертировать Contract в Act

        Act act = new Act(0,LocalDate.of(2000,1,1), new String[] {"", ""});

        act.setActNumber(contract.getContractNumber());
        act.setActDate(contract.getContractDate());
        act.setActList(contract.getContractList());

        System.out.printf("%s", act);

    }
}
