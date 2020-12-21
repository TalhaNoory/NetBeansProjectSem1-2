package opgave4;

import org.junit.Test;
import static org.junit.Assert.*;

public class WeatherTest {

    // Test opgave 4
    WeatherInfoAssembler weather = new WeatherInfoAssembler();

    @Test
    public void testGatherWeatherInfo() {

        int[] temps = {2, 8, 2};
        WeatherInfo expected = new WeatherInfo(2, 8, 4);
        WeatherInfo result = weather.gatherWeatherInfo(temps);
        assertEquals(expected.getLow(), result.getLow());
        assertEquals(expected.getHigh(), result.getHigh());
        assertEquals(expected.getAvg(), result.getAvg(), 0.1);
    }

    @Test
    public void testGatherWeatherInfoIncludingMinusTemperature() {

        int[] temps = {5, -1, -2, -2};
        WeatherInfo expected = new WeatherInfo(-2, 5, 0);
        WeatherInfo result = weather.gatherWeatherInfo(temps);
        assertEquals(expected.getLow(), result.getLow());
        assertEquals(expected.getHigh(), result.getHigh());
        assertEquals(expected.getAvg(), result.getAvg(), 0.1);
    }

    @Test
    public void testGatherWeatherInfoWithDecimalAverage() {

        int[] temps = {2, 8, 3};
        WeatherInfo expected = new WeatherInfo(2, 8, 4.3);
        WeatherInfo result = weather.gatherWeatherInfo(temps);
        assertEquals(expected.getHigh(), result.getHigh());
        assertEquals(expected.getAvg(), result.getAvg(), 0.1);
    }

}
