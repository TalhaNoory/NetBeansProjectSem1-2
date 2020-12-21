
package marios.pizzabar;

import java.util.ArrayList;
import java.util.List;


public class MariosPizzabar {

    List<Ordrer> ordrerList = new ArrayList();
    List<Pizza> pizzaList = new ArrayList();
    
    public static void main(String[] args) {
        MariosPizzabar m = new MariosPizzabar();
        //lav et loop så en bruger kan skrive deres navn og vælge pizzaer de vil købe
        
        //opret ordre
        Pizza pizza = new Pizza("Per", 10, 10);
        m.pizzaList.add(pizza);
        //add ordren til pizzaList
        m.ordrerList.add(new Ordrer(m.pizzaList, "per"));
    //remove alle pizzar i slutningen af loopet
   // m.pizzaList.removeAll(m.pizzaList);
    }
    
}
