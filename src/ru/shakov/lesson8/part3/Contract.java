package ru.shakov.lesson8.part3;

import java.util.Arrays;

public class Contract {
    private int contractNumber;
    private String contractDate;
    private String[] contractS;

    public Contract(int contractNumber, String contractDate, String[] contractS) {
        this.contractNumber = contractNumber;
        this.contractDate = contractDate;
        this.contractS = contractS;
    }

    public int getContractNumber() {
        return contractNumber;
    }

    public String getContractDate() {
        return contractDate;
    }

    public String[] getContractS() {
        return contractS;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "Number=" + contractNumber +
                ", Date='" + contractDate + '\'' +
                ", List=" + Arrays.toString(contractS) +
                '}';
    }
}
