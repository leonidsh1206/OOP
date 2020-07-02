package ru.shakov.lesson8.part3;

import java.time.LocalDate;
import java.util.Arrays;

public class Contract {
    private static int contractNumber;
    private static LocalDate contractDate;
    private static String[] contractList;



    public Contract(int contractNumber, LocalDate contractDate, String[] contractList) {
        this.contractNumber = contractNumber;
        this.contractDate = contractDate;
        this.contractList = contractList;
    }

    public static int getContractNumber() {
        return contractNumber;
    }

    public static LocalDate getContractDate() {
        return contractDate;
    }

    public static String[] getContractList() {
        return contractList;
    }


    @Override
    public String toString() {
        return "Contract{" +
                "Number=" + contractNumber +
                ", Date='" + contractDate + '\'' +
                ", List=" + Arrays.toString(contractList) +
                '}';
    }
}
