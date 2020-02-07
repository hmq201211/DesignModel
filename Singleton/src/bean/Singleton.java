package bean;

/**
 * @ClassName: DesignModel->Singleton
 * @Description:
 * @Author: Mingqing Hou
 * @Create: 2020-02-06 10:10
 **/
public class Singleton {
    //volatile 关键词保证当singleton变量被初始化成Singleton实例时， 多个线程能正确处理singleton变量
    private volatile static Singleton singleton;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            // check the instance , when the instance is null,  go into the synchronized block
            // notice that the synchronized block executes only once totally
            synchronized (Singleton.class) {
                if (singleton == null) {// check the instance twice.
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
