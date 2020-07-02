package ru.shakov.lesson8.part3;

import java.time.LocalDate;

public class Conversion {

    public static void conversion() {

        Act act = new Act(0, LocalDate.of(2000,1,1), new String[] {"", ""});
        act.setActNumber(Contract.getContractNumber());
        act.setActDate(Contract.getContractDate());
        act.setActList(Contract.getContractList());

        System.out.printf("%s", act);

    }
}
