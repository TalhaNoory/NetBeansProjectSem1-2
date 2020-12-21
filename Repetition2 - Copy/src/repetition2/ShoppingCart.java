package repetition2;

import java.util.ArrayList;

public class ShoppingCart {

    private ArrayList<ItemOrder> totalItems = new ArrayList<>();

    public void addItems(Item item, int quantity) {
        totalItems.add(new ItemOrder(item, quantity));
    }

    public void removeItems(Item item, int quantity) {
        totalItems.remove(quantity);
    }

    public boolean searchItems(ItemOrder io) {
            /* Her går vi igennem ordren og har givet den værdien x, 
            så vi kan levere totalItems ind i x'et */
        for (ItemOrder x : totalItems) {
            /* Her siger vi, at hvis x er io 
            så skal den returnere true */
            if (x.equals(io)) {
                return true;
            }
        }/* Hvis x ikke er equal io, 
         skal den returnere false */
        return false;
    }

}
