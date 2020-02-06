package version_2.bean;

/**
 * @ClassName: DesignModel->ShanghaiPizzaStore
 * @Description:
 * @Author: Mingqing Hou
 * @Create: 2020-01-27 17:16
 **/
public class ShanghaiPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")){
            pizza = new ShanghaiStyleCheesePizza(new ShanghaiPizzaStoreIngredientMaker());
            pizza.setName("ShanghaiStyleCheesePizza");
        }

        return pizza;
    }
}
