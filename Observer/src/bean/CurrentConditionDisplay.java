package bean;

/**
 * @ClassName: DesignModel->CurrentConditionDisplay
 * @Description:
 * @Author: Mingqing Hou
 * @Create: 2019-12-18 17:44
 **/
public class CurrentConditionDisplay implements Display, Observer {
    float temperature;
    float humidity;

    Subject subject;

    public CurrentConditionDisplay() {

    }

    public CurrentConditionDisplay(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void display() {
        System.out.println("temperature: " + temperature + " humidity: " + humidity);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
