package bean;

import java.util.ArrayList;

/**
 * @ClassName: DesignModel->WeatherData
 * @Description:
 * @Author: Mingqing Hou
 * @Create: 2019-12-18 17:34
 **/
public class WeatherData implements Subject {
    ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyAllObservers();
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
        notifyAllObservers();
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
        notifyAllObservers();
    }

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if (index > -1) {
            observers.remove(index);
        }
    }
}
