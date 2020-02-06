package version_1.test;

import version_1.bean.BeijingPizzaStore;
import version_1.bean.Pizza;
import version_1.bean.ShanghaiPizzaStore;

/**
 * @ClassName: DesignModel->Test
 * @Description:
 * @Author: Mingqing Hou
 * @Create: 2020-01-27 17:17
 **/
public class Test {
    public static void main(String[] args) {
        BeijingPizzaStore beijingPizzaStore = new BeijingPizzaStore();
        ShanghaiPizzaStore shanghaiPizzaStore = new ShanghaiPizzaStore();

        Pizza beijingPizza = beijingPizzaStore.orderPizza("cheese");
        Pizza shanghaiPizza = shanghaiPizzaStore.orderPizza("cheese");

        System.out.println("end...");
    }
}
