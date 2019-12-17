package bean;

/**
 * @ClassName: DesignModel->FlyByEngines
 * @Description:
 * @Author: Mingqing Hou
 * @Create: 2019-12-17 22:23
 **/
public class FlyByEngines implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I fly by engines");
    }
}
