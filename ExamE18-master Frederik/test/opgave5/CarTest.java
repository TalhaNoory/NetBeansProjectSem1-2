package opgave5;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

// Test opgave 5
public class CarTest {
    private CarHandler carHandler;
    private ArrayList<Car> cars;
    
    @Before
    public void setUp() {
        carHandler = new CarHandler();
        
        cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Corolla", 1966));
        cars.add(new Car("Ford", "F-Series", 1948));
        cars.add(new Car("Volkswagen", "Golf", 1974));
        cars.add(new Car("Honda", "Civic", 1972));
        cars.add(new Car("Volkswagen", "Passat", 1973));
        cars.add(new Car("Volkswagen", "Golf", 1973));
    }
 
    
    @Test
    public void testSortByMakeModelYear(){
        carHandler.sortByMakeModelYear(cars);
        assertTrue(cars.get(0).equals(new Car("Ford", "F-Series", 1948)));
        assertTrue(cars.get(1).equals(new Car("Honda", "Civic", 1972)));
        assertTrue(cars.get(2).equals(new Car("Toyota", "Corolla", 1966)));
        assertTrue(cars.get(3).equals(new Car("Volkswagen", "Golf", 1973)));
        assertTrue(cars.get(4).equals(new Car("Volkswagen", "Golf", 1974)));
        assertTrue(cars.get(5).equals(new Car("Volkswagen", "Passat", 1973)));
    }
    
    @Test
    public void testSortByYearMakeModel(){
        carHandler.sortByYearMakeModel(cars);
        assertTrue(cars.get(0).equals(new Car("Ford", "F-Series", 1948)));
        assertTrue(cars.get(1).equals(new Car("Toyota", "Corolla", 1966)));
        assertTrue(cars.get(2).equals(new Car("Honda", "Civic", 1972)));
        assertTrue(cars.get(3).equals(new Car("Volkswagen", "Golf", 1973)));
        assertTrue(cars.get(4).equals(new Car("Volkswagen", "Passat", 1973)));
        assertTrue(cars.get(5).equals(new Car("Volkswagen", "Golf", 1974)));
    }
    
   
}

