package trialexam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class TrialExam7 {
    
    public Reservation reserveTable(int numberOfPeople, int startTime, int endTime){
        if(numberOfPeople <= 0) throw new IllegalArgumentException();
        if(startTime < 0 || startTime >= 24) throw new IllegalArgumentException();
        if(endTime < 0 || endTime >= 24) throw new IllegalArgumentException();
        if(endTime < startTime) throw new IllegalArgumentException();
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
        if(reservations.size() > 5) return true;
        int total = 0;
        for(Reservation r : reservations){
            total += r.getNumberOfPeople();
        }
        return total > 20;
    }
    
    public Reservation earliestReservation(ArrayList<Reservation> reservations){
        Reservation earliest = reservations.get(0);
        for (int i = 1; i < reservations.size(); i++) {
            Reservation r = reservations.get(i);
            if(r.getStartTime() < earliest.getStartTime())
                earliest = r;
        }
        return earliest;
    }
    
    public ArrayList<Reservation> afterEight(ArrayList<Reservation> allReservations){
        ArrayList<Reservation> l = new ArrayList<>();
        for(Reservation r : allReservations){
            if(r.getStartTime() >= 20)
                l.add(r);
        }
        return l;
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
        int total = 0;
        for(String line : order.split("\n")){
            String _qty = line.split(" x ")[0].trim();
            int qty = Integer.parseInt(_qty);
            
            String _price = line.split("kr. ")[1].trim();
            int price = Integer.parseInt(_price);
            
            total += qty * price;
        }
        return total;
    }
    
    public boolean hasOverlappingReservations(ArrayList<Reservation> reservations){
        for(Reservation r : reservations){
            for(Reservation r1 : reservations){
                if(r.equals(r1)) continue;
                if(r.getStartTime() > r1.getStartTime() && r.getStartTime() < r1.getEndTime()) return true;
                if(r.getEndTime() > r1.getStartTime() && r.getEndTime() < r1.getEndTime()) return true;
            }
        }
        return false;
    }
        
    public int getNumberOfReservationsForTable(HashMap<String, ArrayList<Reservation>> reservations, Table table){
        ArrayList<Reservation> l = reservations.get(table.getTableId());
        return l == null ? 0 : l.size();
    }
    
    public void sortTablesBySize(ArrayList<Table> tables){
        Collections.sort(tables, Comparator.comparing(Table::getNumberOfSeats));
    }

    /*
    time has the format hh:mm
    hours are always in [00-23]
    minutes are always in [00-59]
    A reservation is an earlyBird if it is before 16:30
    */
    public boolean earlyBird(String time){
        String[] a = time.split((":"));
        int hour = Integer.parseInt(a[0]);
        int min = Integer.parseInt(a[1]);
        
        return hour < 16 || (hour == 16 && min < 30);
    }
}
