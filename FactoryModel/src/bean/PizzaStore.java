package bean;

/**
 * @ClassName: DesignModel->PizzaStore
 * @Description:
 * @Author: Mingqing Hou
 * @Create: 2020-01-27 17:07
 **/
public abstract class PizzaStore {
    protected abstract Pizza createPizza(String type);

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
