package opgave4;

import java.lang.reflect.Constructor;
import java.time.LocalDate;
import org.junit.Test;
import static org.junit.Assert.*;

public class OrderTest {
    private OrderFactory fact;

    public OrderTest() {
        fact = new OrderFactory();
    }

    //opgave 4a
    @Test
    public void testConstructorExists() {
        assertTrue("There must be a constructor", Order.class.getConstructors().length > 0);
    }
    
    //opgave 4a
    @Test
    public void testConstructorParamsCount(){
        for(Constructor<?> c : Order.class.getConstructors()){
            if(c.getParameterCount() == 3) return;
        }
        fail("There must be a constructor which takes 3 parameters!");
    }
    
    //opgave 4a
    @Test
    public void testMakeOrder(){
        OrderFactory fact = new OrderFactory();
        Order o = fact.makeOrder(1, "t-shirt", LocalDate.now());
        assertNotNull("Order object is null", o);
    }
    
     //opgave 4b
    @Test 
    public void testMakeOrderWithBadItemName(){
        try{
            Order o = fact.makeOrder(1, null, LocalDate.now());
            fail("ItemName must not be null!");
        }catch(IllegalArgumentException ex){}
        
        try{
            Order o = fact.makeOrder(1, "", LocalDate.now());
            fail("ItemName must not be empty!");
        }catch(IllegalArgumentException ex){}
    }
    
     //opgave 4b
    @Test
    public void testMakeOrderWithBadCreationDate(){
        try{
            Order o = fact.makeOrder(1, "t-shirt", null);
            fail("Creation date must not be null!");
        }catch(IllegalArgumentException ex){}
    }
   
}
