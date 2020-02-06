package version_2.bean;

import java.util.ArrayList;
import java.util.List;

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
    List<String> toppings = new ArrayList<>();

    abstract void prepare();

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
    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", toppings=" + toppings +
                '}';
    }
}
