package version_2.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: DesignModel->ShanghaiPizzaStoreIngredientMaker
 * @Description:
 * @Author: Mingqing Hou
 * @Create: 2020-01-30 20:14
 **/
public class ShanghaiPizzaStoreIngredientMaker implements IngredientMaker
{
    @Override
    public String createDough() {
        return "small";
    }

    @Override
    public String createSauce() {
        return "sweet";
    }

    @Override
    public List<String> createToppings() {
        List<String> toppings = new ArrayList<>();
        toppings.add("carrot");
        toppings.add("rice");
        return toppings;
    }
}
