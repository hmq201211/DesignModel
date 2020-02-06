package version_2.test;

import version_2.bean.BeijingPizzaStore;
import version_2.bean.BeijingPizzaStoreIngredientMaker;
import version_2.bean.Pizza;
import version_2.bean.ShanghaiPizzaStore;

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
        System.out.println(beijingPizza);
        System.out.println(shanghaiPizza);
        System.out.println("end...");
    }
}
