package bean;

/**
 * @ClassName: DesignModel->Duck
 * @Description:
 * @Author: Mingqing Hou
 * @Create: 2019-12-17 17:41
 **/
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {

    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void performFlying() {
        flyBehavior.fly();
    }

    public void performQuacking() {
        quackBehavior.quack();
    }

    public abstract void performDisplay();
}
