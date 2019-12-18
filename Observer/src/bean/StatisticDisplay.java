package bean;

import javax.sound.midi.Soundbank;

/**
 * @ClassName: DesignModel->StatisticDisplay
 * @Description:
 * @Author: Mingqing Hou
 * @Create: 2019-12-18 22:42
 **/
public class StatisticDisplay implements Display, Observer {
    Subject subject;
    float maximumTemperature;
    float minimumTemperature;
    float sumTemperature;
    int count;

    public StatisticDisplay(Subject subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("最低温度: " + minimumTemperature);
        System.out.println("最高温度: " + maximumTemperature);
        System.out.println("平均温度: " + sumTemperature / count);

    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        sumTemperature += temperature;
        if (maximumTemperature < temperature) {
            maximumTemperature = temperature;
        }
        if (minimumTemperature > temperature) {
            minimumTemperature = temperature;
        }
        count++;
        display();
    }
}
