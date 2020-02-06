package version_2.bean;

import java.util.List;

public interface IngredientMaker {
    String createDough();
    String createSauce();
    List<String> createToppings();

}
