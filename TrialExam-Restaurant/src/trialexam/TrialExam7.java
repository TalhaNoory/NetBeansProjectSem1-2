package trialexam;

import java.util.ArrayList;
import java.util.HashMap;

public class TrialExam7 {
    
    public Reservation reserveTable(int numberOfPeople, int startTime, int endTime){
        
        if(numberOfPeople <= 0 || startTime <= 0 || endTime <= 0) {
            throw new IllegalArgumentException();
        }
        System.out.println("1st test");
        if(startTime >= 24 || endTime >= 24) {
            throw new IllegalArgumentException();
        }
        System.out.println("2nd test");
        if(startTime > endTime) {
            throw new IllegalArgumentException();
        }
        System.out.println("3rd test");
        
        return new Reservation(numberOfPeople, startTime, endTime);
    }
    
    public Table makeFamilyTable(String id, int numberOfSeats, int numberOfChildrensSeats){
        
        return new FamilyTable(id, numberOfSeats, numberOfChildrensSeats);
        
    }
    
    /*
    There is much to do if there are more than 5 reservations or if the total number of people on all 
    the reservations combined is more than 20.
    Return true if there is much to do.
    */
    public boolean muchToDoAboutNothing(ArrayList<Reservation> reservations){
//        throw new UnsupportedOperationException();

//        Hvis reservationen er større end 5, skal den returnere true;
        if(reservations.size() > 5) return true;
//        Her har vi en int med variablen total, som starter ved 0;
        int total = 0;
//        Her looper vi igennem reservationen og putter den ind i variablen 'r';
        for (Reservation r : reservations) {            
//            Derefter henter vi metoden via Array som er reservationen, og siger den skal være '='
//            variablen total, som så bliver plusset
            total += r.getNumberOfPeople();
            
//            Her giver vi total en grænse på at den skal være over 20, før vi returnere den;
        } return total > 20;
        
    }
    
    public Reservation earliestReservation(ArrayList<Reservation> reservations){
//        throw new UnsupportedOperationException();

//        Her deklarere jeg variablen 'earliest' med reservations.get(0);
        Reservation earliest = reservations.get(0);
//        Dermed kører vi et loop, hvor reservationen.size() skal være mindre end 'i'
//        Grunden til at vi har puttet værdien 'i' med 1, er fordi vi vil have reserveret bordet ved 0'tiden
        for (int i = 1; i < reservations.size(); i++) {
//            Dermed siger vi 'r' skal være lige med reservationen, hvor vi så putter 'i'
            Reservation r = reservations.get(i);
//            Her siger vi så at reservationen skal være så tidligst som muligt;
            if(r.getStartTime() < earliest.getStartTime())
//                Her siger vi så at 'r' skal være '=' earliest;
                earliest = r;
//            Til sidst retunere vi 'earliest;
        }
        return earliest;

    }
    
    public ArrayList<Reservation> afterEight(ArrayList<Reservation> allReservations){
//        throw new UnsupportedOperationException();

//      Vi henter en ny Array, med en variabel 'l' fordi det en kort variabel;
        ArrayList<Reservation> l = new ArrayList<>();
//      Så kører vi Arrayet igennem et loop hvor hele Arrayet bliver omdannet til en class med variablen 'r'
        for (Reservation r : allReservations) {
//            Derpå henter vi klassen og henter metoden getStartTime() og siger
//            At reservationen SKAL være efter 20:00
            if (r.getStartTime() >= 20)
//                Til sidst tilføjer vi det til arrayet, hvor vi så retunere hvores array:
                l.add(r);
            
        } return l;

    }
    
    /*
    Order example:
        4 x glas vand á kr. 14
        2 x glas rødvin á kr. 26
        2 x Hakkebøf m. bearnaise á kr. 139
        1 x Vegetarburger á kr. 99
        1 x Filet minon m. garniture á kr. 149
    
    Format:
        <count> x <name> á kr. <price>\n
    */
    public int calculatePrice(String order){
//        throw new UnsupportedOperationException();

        int total = 0;
        for (String line : order.split("\n")) {
            String _qty = line.split(" x ")[0].trim();
            int qty = Integer.parseInt(_qty);
            
            String _price = line.split("kr. ")[1].trim();
            int price = Integer.parseInt(_price);
            
            total += qty * price;
            
        }
        return total;

    }
    
    public boolean hasOverlappingReservations(ArrayList<Reservation> reservations){
        throw new UnsupportedOperationException();
    }
        
    public int getNumberOfReservationsForTable(HashMap<String, ArrayList<Reservation>> reservations, Table table){
        throw new UnsupportedOperationException();
    }
    
    public void sortTablesBySize(ArrayList<Table> tables){
        throw new UnsupportedOperationException();
    }

    /*
    time has the format hh:mm
    hours are always in [00-23]
    minutes are always in [00-59]
    A reservation is an earlyBird if it is before 16:30
    */
    public boolean earlyBird(String time){
        throw new UnsupportedOperationException();
    }
}
