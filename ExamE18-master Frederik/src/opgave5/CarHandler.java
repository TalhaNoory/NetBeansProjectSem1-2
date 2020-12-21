package opgave5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CarHandler {

    /**
     * Opgave 5A: This method sorts a list of cars by make. If two cars are the
     * same make, they should be sorted by model. If two cars has both the same
     * make and model, they should be sorted by year. 
     * The class Car is provided.
     *
     * @param cars The ArrayList of cars to be sorted.
     */
    public void sortByMakeModelYear(ArrayList<Car> cars) {
        Comparator<Car> comp = new Comparator<Car>() {
            @Override
            public int compare(Car c1, Car c2) {
                int val = c1.getMake().compareTo(c2.getMake());
                if (val == 0){
                    val = c1.getModel().compareTo(c2.getModel());
                }
                if (val == 0){
                    val = c1.getYear() - c2.getYear();
                }
                return val;
            }
        };
            Collections.sort(cars,comp);                    
    }

    /**
     * Opgave 5B: This method sorts a list of cars by year. If two cars are from
     * the same year, they should be sorted by make. If two cars has both the
     * same year and make, they should be sorted by model. 
     * The class Car is provided. 
     *
     * @param cars The ArrayList of cars to be sorted.
     */
    public void sortByYearMakeModel(ArrayList<Car> cars) {
        Comparator<Car> comp = new Comparator<Car>() {
            @Override
            public int compare(Car c1, Car c2) {
                int val = c1.getYear() - c2.getYear();
                if (val == 0){
                    val = c1.getMake().compareTo(c2.getMake());
                }
                if (val == 0){
                    val = c1.getModel().compareTo(c2.getModel());
                }
                return val;
            }
        };
        Collections.sort(cars, comp);
    }

}
