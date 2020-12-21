package opgave1;

public class LeapYear {
    /*(5 %) Implementér metoden isLeapYear() i klassen LeapYear, der tester for skudår.
    Metoden modtager et årstal som en int og returnerer true, hvis året er skudår, og ellers false. 
    Regler for beregning af skudår kan findes her: https://da.wikipedia.org/wiki/Skud%C3%A5r */
    public boolean isLeapYear(int year) {
       return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }
    
    /*(10 %) Skriv en ny metode i klassen LeapYear, der kan returnere antal skudår inden for en periode. Metodens signatur skal se således ud: 
 
    public int numberOfLeapYears(int start, int end) 
    Startår må ikke være større end slutår. I denne situation returneres -1 som fejlkode */
    
    public int numberOfLeapYears(int start, int end) {
        if (start > end){
            return -1;
        }
        int counter = 0;
        for (int i = start; i <= end; i++)
            if (isLeapYear(i)){
                counter += 1;
            }
        return counter;
    }
}
