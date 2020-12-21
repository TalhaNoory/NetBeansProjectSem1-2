package opgave1;

public class LeapYear {
    
    
    
    public boolean isLeapYear(int year) {

        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
        
    }
    
    public int numberOfLeapYears(int start, int end) {
        
       if (start > end) {
           return -1;
       }
       int counter = 0;
        for (int i = start; i <= end; i++) 
            if (isLeapYear(i)) {
                counter += 1;
            }
        return counter;
    }
}
