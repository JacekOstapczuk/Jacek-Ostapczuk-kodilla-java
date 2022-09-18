package com.kodilla.testing.weather.stub;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public double temperatureAverage() {
        double temperatureTotaly = 0;

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            double singleTemperature = temperature.getValue();
            temperatureTotaly = temperatureTotaly + singleTemperature;
        }
        int entryNumber = temperatures.getTemperatures().size();
       double temperatureAverage = temperatureTotaly / entryNumber;
        return temperatureAverage;
    }

    public double temperatureMedian() {
        ArrayList<Double> singleTemperatureList = new ArrayList<>();
        double temperatureMedian = 0;
        double average = 0.0;
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            double singleTemperature = temperature.getValue();
            singleTemperatureList.add(singleTemperature);
        }
        Object zmienna =singleTemperatureList.toArray();
        double[] singleTemperatureTable = (double[]) zmienna;

        if (singleTemperatureTable.length % 2 == 0) {

            average = singleTemperatureTable[singleTemperatureTable.length / 2] + singleTemperatureTable[(singleTemperatureTable.length / 2) - 1];
            temperatureMedian = average / 2.0;
        } else {
            temperatureMedian = singleTemperatureTable[singleTemperatureTable.length / 2];
        }
        return temperatureMedian;
    }
}