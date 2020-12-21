package opgave2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;
import java.util.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalendarCheckTest {
        
    List<DayOfWeek> day = new ArrayList<>();
    
    @Test
    //opgave 2
    public void testWhichOnlyCanBeRunOnFridays() {
        //Arrange 
        CalendarCheckInterface checker = new CalendarCheck();
        LocalDate date = LocalDate.now(); 
        
        //LocalDate newDate = date.plusDays(1); //to be used if test is run on a Thursday !!!
        
        //Act
        boolean result = checker.isItFriday(date);
        
        //Assert
        assertTrue(result);
    }

    @Test
    //opgave 2
    public void testWhichCanBeRunOnAnyDay() {
        //Arrange
        CalendarCheckInterface checker = new CalendarCheck();
        
        LocalDate date = LocalDate.of(2018, Month.APRIL, 19);
        LocalDate nextFriDay = date.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        
        // Act
        boolean result = checker.isItFriday(date);
        
        //Assert
        assertTrue(result);
    }
}
