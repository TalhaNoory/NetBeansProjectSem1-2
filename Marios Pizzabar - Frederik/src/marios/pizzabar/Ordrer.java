
package marios.pizzabar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;


public class Ordrer implements Comparable<Ordrer> {
    //private List<Ordrer> alleOrdrerList;
    //private List<Ordrer> bestillingsList;
    private Date dateTime; 
    private List<Pizza> pizza;
    private String name;
    
    public Ordrer(Date dateTime, List<Pizza> pizza, String name) {
        this.dateTime = dateTime;
        this.pizza = pizza;
        this.name = name;
    }

    public Ordrer(List<Pizza> pizza, String name) {
        this.pizza = pizza;
        this.name = name;
    }
    
    
    

  public Date getDateTime() {
    return dateTime;
  }

  public void setDateTime(Date datetime) {
    this.dateTime = datetime;
  }
    
    @Override
  public int compareTo(Ordrer ordrer) {
  return getDateTime().compareTo(ordrer.getDateTime());
  }
    
//    public void sortOrdersByTime(List<Pizza> alleOrdrerList){
//        Collections.sort(alleOrdrerList);
//    }
    
//    public void ordersDelivered(Ordrer ordrer){
//        alleOrdrerList.remove(ordrer);
//        bestillingsList.add(ordrer);
//    }

    
}
