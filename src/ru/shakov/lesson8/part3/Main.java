package ru.shakov.lesson8.part3;

import java.time.LocalDate;

import static java.time.LocalDate.parse;

public class Main {
    public static void main(String[] args) {

        Contract contract = new Contract(123, LocalDate.of(2020,7,2), new String[] {"Position1", "Position2"});

        System.out.printf("%s%n", contract);

        // следующий код необходимо вынести в отдельный класс с методом,
        // который будет конвертировать Contract в Act

        Conversion.conversion();

    }
}
