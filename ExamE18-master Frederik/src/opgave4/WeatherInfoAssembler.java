package opgave4;

public class WeatherInfoAssembler
{
    /**
     * Opgave4: This method returns aggregated weather info from a list of
     * temperatures.
     *
     * @param temps array of temperatures
     * @return weather info object containing lowest, highest and average
     * temperature
     */
    public WeatherInfo gatherWeatherInfo(int[] temps) {
        int lowest = 72346176;
        int highest = -2376234;
        int sum = 0;
        for (int t : temps) {
            if (t < lowest){
                lowest = t;
            }
            if (t > highest){
                highest = t;
            }
            sum += t;
        }
        double avg = (double)sum / (double)temps.length;
        return new WeatherInfo(lowest, highest, avg);
    }

}
