package version_1.bean;

/**
 * @ClassName: DesignModel->BeijingPizzaStore
 * @Description:
 * @Author: Mingqing Hou
 * @Create: 2020-01-27 17:11
 **/
public class BeijingPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese"))
            pizza = new BeijingStyleCheesePizza();
        return pizza;
    }
}
