package opgave5;

import java.util.HashMap;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class InventoryTest {
    private Inventory inventory;
    
    public InventoryTest() {
        inventory = new Inventory();
    }
    
    @Before
    public void setUp() {
    }
    
    @Test
    public void testCalculateInventoryValue(){
        String str = 
            "6 Paraplyer til kr. 45.00\n"
          + "47 Sokker til kr. 13.50\n"
          + "12 Bowlingkugler til kr. 365.00\n";
        /* 
            6 *  45    =   270
           47 *  13.50 =   634.5
           12 * 365    =  4380
           Total       =  5284.5
        */
        double expected = 5284.5;
        double actual = inventory.calculateInventoryValue(str);
        assertEquals(expected, actual, 50);
    }
    
    @Test
    public void testAddToStock(){
        HashMap<String, Integer> stock = new HashMap<>();
        stock.put("umbrella", 6);
        stock.put("socks", 47);
        inventory.addToStock(stock, "bowling ball", 12);
        int expected = 3;
        int actual = stock.keySet().size();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAddToStockExistingItem(){
        HashMap<String, Integer> stock = new HashMap<>();
        stock.put("umbrella", 6);
        stock.put("socks", 47);
        stock.put("bowling ball", 12);
        inventory.addToStock(stock, "bowling ball", 4);
        int expected = 3;
        int actual = stock.keySet().size();
        assertEquals(expected, actual);
        
        expected = 16;
        actual = stock.get("bowling ball");
        assertEquals(expected, actual);
    }
}
