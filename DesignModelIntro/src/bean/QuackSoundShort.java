package bean;

/**
 * @ClassName: DesignModel->QuackSoundShort
 * @Description:
 * @Author: Mingqing Hou
 * @Create: 2019-12-17 22:26
 **/
public class QuackSoundShort implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("short quack sound");
    }
}
