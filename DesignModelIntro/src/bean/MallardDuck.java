package bean;

/**
 * @ClassName: DesignModel->MallardDuck
 * @Description:
 * @Author: Mingqing Hou
 * @Create: 2019-12-17 22:33
 **/
public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyByWings();
        quackBehavior = new QuackSoundLong();
    }

    @Override
    public void performDisplay() {
        System.out.println("display");
    }
}
