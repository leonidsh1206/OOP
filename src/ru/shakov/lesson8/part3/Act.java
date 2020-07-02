package ru.shakov.lesson8.part3;

import java.time.LocalDate;
import java.util.Arrays;

public class Act {
    private int actNumber;
    private LocalDate actDate;
    private String[] actList;

    public void setActNumber(int actNumber) {
        this.actNumber = actNumber;
    }

    public void setActDate(LocalDate actDate) {
        this.actDate = actDate;
    }

    public void setActList(String[] actList) {
        this.actList = actList;
    }

    public Act(int actNumber, LocalDate actDate, String[] actList) {
        this.actNumber = actNumber;
        this.actDate = actDate;
        this.actList = actList;
    }

    @Override
    public String toString() {
        return "Act{" +
                "actNumber=" + actNumber +
                ", actDate='" + actDate + '\'' +
                ", actList=" + Arrays.toString(actList) +
                '}';
    }
}
