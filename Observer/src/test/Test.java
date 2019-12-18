package test;

import bean.*;

/**
 * @ClassName: DesignModel->Test
 * @Description:
 * @Author: Mingqing Hou
 * @Create: 2019-12-18 23:06
 **/
public class Test {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        StatisticDisplay statisticDisplay = new StatisticDisplay(weatherData);
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setTemperature(123);
        weatherData.setTemperature(234);
        weatherData.setHumidity(123);
        weatherData.setHumidity(234);
        weatherData.setPressure(123);
        weatherData.setPressure(234);

    }
}
