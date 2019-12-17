package bean;

/**
 * @ClassName: DesignModel->Duck
 * @Description:
 * @Author: Mingqing Hou
 * @Create: 2019-12-17 17:41
 **/
public abstract class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public abstract void performFlying();

    public abstract void performQuacking();

    public abstract void performSwimming();
}
