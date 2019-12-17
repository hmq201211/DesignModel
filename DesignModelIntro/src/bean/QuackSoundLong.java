package bean;

/**
 * @ClassName: DesignModel->QuackSoundLong
 * @Description:
 * @Author: Mingqing Hou
 * @Create: 2019-12-17 22:28
 **/
public class QuackSoundLong implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("long quack sound");
    }
}
