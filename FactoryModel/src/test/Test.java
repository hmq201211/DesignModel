package test;

import bean.BeijingPizzaStore;
import bean.Pizza;
import bean.ShanghaiPizzaStore;

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
