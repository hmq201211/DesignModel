package version_2.bean;

/**
 * @ClassName: DesignModel->BeijingStyleCheesePizza
 * @Description:
 * @Author: Mingqing Hou
 * @Create: 2020-01-27 17:00
 **/
public class BeijingStyleCheesePizza extends Pizza {
    IngredientMaker ingredientMaker;
    public BeijingStyleCheesePizza(IngredientMaker ingredientMaker) {
        this.ingredientMaker = ingredientMaker;
    }

    @Override
    void prepare() {
        System.out.println("begin to make Beijing Style Cheese Pizza");
        dough = ingredientMaker.createDough();
        sauce = ingredientMaker.createSauce();
        toppings = ingredientMaker.createToppings();
    }
}
