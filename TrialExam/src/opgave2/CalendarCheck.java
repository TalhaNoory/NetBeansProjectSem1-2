package opgave2;

import java.time.DayOfWeek;
import java.time.LocalDate;

/*Skriv en metode i klassen CalendarCheck, som implementerer CalendarCheckInterface. 
 Metoden skal undersøge om en dato er en fredag. Metoden modtager et LocalDate objekt3, som indeholder en dato,
 og returnere true, hvis ugedagen er en fredag, og ellers false. 
 
Hint: Klassen LocalDate har en metode getDayOfWeek() som returnerer en ugedag fra en enum kaldet DayOfWeek.  
 DayOfWeek repræsenterer de 7 ugedage MONDAY til SUNDAY.   
 Man kan fx foretage flg. operation (kun eksempel og ikke direkte overførbar til jeres løsning), som vil udskrive ”THURSDAY” på skærmen:  
 
System.out.printf(DayOfWeek.MONDAY.plus(3));*/
public class CalendarCheck implements CalendarCheckInterface {

    @Override
    public boolean isItFriday(LocalDate date) {
        return date.getDayOfWeek() == DayOfWeek.FRIDAY;

    }

}
