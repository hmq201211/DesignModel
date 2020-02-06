package version_2.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: DesignModel->BeijingPizzaStoreIngredientMaker
 * @Description:
 * @Author: Mingqing Hou
 * @Create: 2020-01-30 17:08
 **/
public class BeijingPizzaStoreIngredientMaker implements IngredientMaker {
    @Override
    public String createDough() {
        return "big";
    }

    @Override
    public String createSauce() {
        return "hot and salt";
    }

    @Override
    public List<String> createToppings() {
        List<String> toppings = new ArrayList<>();
        toppings.add("cucumber");
        toppings.add("pudding");
        return toppings;
    }
}
