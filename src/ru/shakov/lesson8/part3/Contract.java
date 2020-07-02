package ru.shakov.lesson8.part3;

import java.time.LocalDate;
import java.util.Arrays;

public class Contract {
    private int contractNumber;
    private LocalDate contractDate;
    private String[] contractList;

    public Contract(int contractNumber, LocalDate contractDate, String[] contractList) {
        this.contractNumber = contractNumber;
        this.contractDate = contractDate;
        this.contractList = contractList;
    }

    public int getContractNumber() {
        return contractNumber;
    }

    public LocalDate getContractDate() {
        return contractDate;
    }

    public String[] getContractList() {
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
