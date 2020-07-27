package ru.shakov.lesson20;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URL;

public class Program {
    public static void main(String[] args) throws Exception {

        /*
        { "product" : "civillight" , "init" : "2020072700" , "dataseries" : [
        { "date" : 20200727, "weather" : "cloudy", "temp2m" : { "max" : 26, "min" : 15 }, "wind10m_max" : 3 },
        { "date" : 20200728, "weather" : "ishower", "temp2m" : { "max" : 26, "min" : 16 }, "wind10m_max" : 3 },
        { "date" : 20200729, "weather" : "rain", "temp2m" : { "max" : 27, "min" : 17 }, "wind10m_max" : 3 }, { "date" : 20200730, "weather" : "rain", "temp2m" : { "max" : 25, "min" : 17 }, "wind10m_max" : 3 }, { "date" : 20200731, "weather" : "rain", "temp2m" : { "max" : 20, "min" : 13 }, "wind10m_max" : 3 }, { "date" : 20200801, "weather" : "rain", "temp2m" : { "max" : 21, "min" : 12 }, "wind10m_max" : 3 }, { "date" : 20200802, "weather" : "rain", "temp2m" : { "max" : 20, "min" : 10 }, "wind10m_max" : 3 } ] }
         */

        URL jsonUrl = new URL("http://www.7timer.info/bin/api.pl?lon=37.616&lat=55.752&product=civillight&output=json");
        ObjectMapper mapper = new ObjectMapper();
        // Создаем новый Response.class куда будем выгружать
        Response response = mapper.readValue(jsonUrl, Response.class);
        for (DataSeries dataSeries : response.getDataseries()) {
            System.out.printf("%d %s %d %d %n",dataSeries.date, dataSeries.weather,
                    dataSeries.temp2m.max, dataSeries.temp2m.min);
        }
    }
}
