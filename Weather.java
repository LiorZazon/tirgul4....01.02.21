package com.company;

import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class Weather {

    public float temperature;
    public int humidityPercentage;
    public boolean cloudy;
    public int chance_for_rain;
     //function

    public void changeChanceOfRain(int chance_for_rain){
        if (chance_for_rain > 0 && chance_for_rain < 100) {
            System.out.println(chance_for_rain);
        }
    }
    public void printTempFahrenheit() {
        System.out.println(String.format("the temperature in fahrenheit is: %f", (temperature * 1.8) + 32));
    }

}
