package version_1.bean;

import java.util.ArrayList;

/**
 * @ClassName: DesignModel->Pizza
 * @Description:
 * @Author: Mingqing Hou
 * @Create: 2020-01-27 16:46
 **/
public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<>();

    void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings...");
        for (String string : toppings)
            System.out.println("    Adding " + string);
    }

    void bake() {
        System.out.println("Bake for 25 minutes at 350 degree");
    }

    void cut() {
        System.out.println("Cut the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Put the pizza into official boxes");
    }

    public String getName() {
        return name;
    }
}
