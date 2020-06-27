package ru.shakov.lesson8.part3;

import java.util.Arrays;

public class Act {
    private int actNumber;
    private String actDate;
    private String[] actS;

    public void setActNumber(int actNumber) {
        this.actNumber = actNumber;
    }

    public void setActDate(String actDate) {
        this.actDate = actDate;
    }

    public void setActS(String[] actS) {
        this.actS = actS;
    }

    public Act(int actNumber, String actDate, String[] actS) {
        this.actNumber = actNumber;
        this.actDate = actDate;
        this.actS = actS;
    }

    @Override
    public String toString() {
        return "Act{" +
                "actNumber=" + actNumber +
                ", actDate='" + actDate + '\'' +
                ", actS=" + Arrays.toString(actS) +
                '}';
    }
}
