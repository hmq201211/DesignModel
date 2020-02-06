package version_2.bean;

/**
 * @ClassName: DesignModel->ShanghaiStyleCheesePizza
 * @Description:
 * @Author: Mingqing Hou
 * @Create: 2020-01-27 17:01
 **/
public class ShanghaiStyleCheesePizza extends Pizza {
    IngredientMaker ingredientMaker;

    public ShanghaiStyleCheesePizza(IngredientMaker ingredientMaker) {
        this.ingredientMaker = ingredientMaker;
    }

    @Override
    void prepare() {
        System.out.println("begin to make Shanghai Style Cheese Pizza");
        dough = ingredientMaker.createDough();
        sauce = ingredientMaker.createSauce();
        toppings = ingredientMaker.createToppings();
    }
}
