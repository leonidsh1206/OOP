package ru.shakov.lesson20;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Response {
    public String product;

    public DataSeries[] dataseries;

    public DataSeries[] getDataseries() {
        return dataseries;
    }

}
