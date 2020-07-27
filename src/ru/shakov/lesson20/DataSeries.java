package ru.shakov.lesson20;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DataSeries {

    public int date;

    public String weather;

    Temp2m temp2m;

    public Temp2m getTemp2m() {
        return temp2m;
    }
}
