package repetition2;

public class ItemOrder {
    private Item item;
    private int quantity;
    
    public ItemOrder (Item item, int quantity){
        this.item = item;
        this.quantity = quantity;
    }
    
    /* Her henter vi vores samlede antal varer og 
    ganger med prisens varer og henter den samlede pris til sidst*/
    public int totalPrice(){
        return quantity * item.getPrice();
    }
 
    public Item getItem(){
        return item;
    }
    
    public int getQuantity(){
        return quantity;
    }
    
    @Override
    public String toString(){
        return quantity + " Stk. " + item.getName() + totalPrice();
    }
}
