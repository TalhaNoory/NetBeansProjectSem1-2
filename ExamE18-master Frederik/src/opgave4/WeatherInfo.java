package opgave4;

/**
 * Opgave 4: Class containing aggregated weather information.
 *
 */
public class WeatherInfo {
    private int low;
    private int high;
    private double avg;
    
    public WeatherInfo(int low, int high, double avg){
        this.low = low;
        this.high = high;
        this.avg = avg;
    }
   
    public int getLow() {
        return this.low;
    }

    public int getHigh(){
        return this.high;
    }

    public double getAvg() {
        return this.avg;
    }

}
