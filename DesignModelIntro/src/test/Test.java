package test;

import bean.Duck;
import bean.FlyByEngines;
import bean.MallardDuck;
import bean.QuackSoundShort;

/**
 * @ClassName: DesignModel->Test
 * @Description:
 * @Author: Mingqing Hou
 * @Create: 2019-12-17 22:36
 **/
public class Test {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.performDisplay();
        duck.performFlying();
        duck.performQuacking();
        duck.setFlyBehavior(new FlyByEngines());
        duck.setQuackBehavior(new QuackSoundShort());
        duck.performDisplay();
        duck.performFlying();
        duck.performQuacking();
    }
}
