package bean;

import javax.sound.midi.Soundbank;

/**
 * @ClassName: DesignModel->ForecastDisplay
 * @Description:
 * @Author: Mingqing Hou
 * @Create: 2019-12-18 22:27
 **/
public class ForecastDisplay implements Display, Observer {
    Subject subject;
    float lastTemperature;
    float currentTemperature = Float.MIN_VALUE;

    public ForecastDisplay(Subject subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

    @Override
    public void display() {
        if (lastTemperature < currentTemperature) {
            System.out.println("要升温了");
        } else {
            System.out.println("要降温了");
        }
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        lastTemperature = currentTemperature;
        currentTemperature = temperature;
        display();
    }
}
