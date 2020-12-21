package trialexam;

import trialexam.Table;
import trialexam.TrialExam7;
import trialexam.FamilyTable;
import trialexam.Reservation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RODA
 */
public class TrialExam7Test {
    private TrialExam7 e;
    
    public TrialExam7Test() {
        e = new TrialExam7();
    }
    
    @Before
    public void setUp() {
    }

    @Test
    public void testReserveTable() {
        Reservation expected = new Reservation(3, 16, 17);
        Reservation actual = e.reserveTable(3, 16, 17);
        assertEquals(expected, actual);
        
        try{
            e.reserveTable(-2, 16, 17);
            fail("Invalid number of people!");
        }catch(IllegalArgumentException e){}
        
        try{
            e.reserveTable(3, -1, 17);
            fail("Invalid start time!");
        }catch(IllegalArgumentException e){}
        
        try{
            e.reserveTable(3, 16, 27);
            fail("Invalie end time!");
        }catch(IllegalArgumentException e){}
        
        try{
            e.reserveTable(3, 17, 16);
            fail("End time must be after start time!");
        }catch(IllegalArgumentException e){}
    }

    @Test
    public void testMakeFamilyTable(){
        Table ft = e.makeFamilyTable("ft01", 5, 2);
        String msg = "A family table should be a specialized table!";
        assertTrue(msg, ft instanceof Table);
//        msg = "A family table should be implemented as FamilyTable!";
//        assertTrue(msg, ft instanceof FamilyTable);
        msg = "child class should have only one field!";
        assertEquals(msg, 1, FamilyTable.class.getDeclaredFields().length);
        
        msg = "FamilyTable should have at least one getter-method!";
        int getterCount = 0;
        for(Method m : FamilyTable.class.getDeclaredMethods()){
            if(m.getName().startsWith("get")) {
                getterCount++;
                try{
                    int actual = (int)m.invoke(ft);
                    int expected = 2;
                    assertEquals(expected, actual);
                }catch(IllegalAccessException | InvocationTargetException e){
                    fail();
                }
            }
        }
        assertTrue(msg, getterCount >= 1);
    }
    
    @Test
    public void testMuchToDoAboutNothing(){
        ArrayList<Reservation> reservations1 = new ArrayList();
        reservations1.add(new Reservation(1, 16, 17));
        reservations1.add(new Reservation(1, 17, 19));
        reservations1.add(new Reservation(1, 19, 20));
        reservations1.add(new Reservation(1, 20, 21));
        boolean expected = false;
        boolean actual;
        String msg;
        try{
            actual = e.muchToDoAboutNothing(reservations1);
            msg = "4 reservations and a total of 4 people is not much work!";
            assertEquals(msg, expected, actual);
        }catch(UnsupportedOperationException e){
            fail();
        }
        
        reservations1.add(new Reservation(1, 16, 17));
        reservations1.add(new Reservation(1, 17, 18));
        reservations1.add(new Reservation(1, 18, 20));
        expected = true;
        actual = e.muchToDoAboutNothing(reservations1);
        msg = "3 more reservations brings it up to 7 reservations, which is much work!";
        assertEquals(msg, expected, actual);
        
        ArrayList<Reservation> reservations2 = new ArrayList();
        reservations2.add(new Reservation(25, 16, 17));
        expected = true;
        actual = e.muchToDoAboutNothing(reservations2);
        msg = "Only 1 reservation, but 25 people, that is much work!";
        assertEquals(msg, expected, actual);
    }
    
    @Test
    public void testEarliestReservation() {
        ArrayList<Reservation> reservations1 = new ArrayList();
        reservations1.add(new Reservation(3, 16, 17));
        reservations1.add(new Reservation(3, 17, 19));
        reservations1.add(new Reservation(3, 19, 20));
        reservations1.add(new Reservation(3, 20, 21));
        reservations1.add(new Reservation(3, 21, 23));
        Reservation expected = new Reservation(3, 16, 17);
        Reservation actual = e.earliestReservation(reservations1);
        assertNotNull(actual);
        assertEquals(expected, actual);
    }

    @Test
    public void testAfterEight() {
        ArrayList<Reservation> reservations1 = new ArrayList();
        reservations1.add(new Reservation(3, 16, 17));
        reservations1.add(new Reservation(3, 17, 19));
        reservations1.add(new Reservation(3, 19, 20));
        reservations1.add(new Reservation(3, 20, 21));
        reservations1.add(new Reservation(3, 21, 23));
        ArrayList<Reservation> expected = new ArrayList<>();
        expected.add(new Reservation(3, 20, 21));
        expected.add(new Reservation(3, 21, 23));
        ArrayList<Reservation> actual = e.afterEight(reservations1);
        assertEquals(expected, actual);
    }

    @Test
    public void testCalculatePrice() {
        String order = "4 x glas vand á kr. 14\n"
                     + "2 x glas rødvin á kr. 26\n"
                     + "2 x Hakkebøf m. bearnaise á kr. 139\n"
                     + "1 x Vegetarburger á kr. 99\n"
                     + "1 x Filet minon m. garniture á kr. 149";
        int expected = (4*14) + (2*26) + (2*139) + 99 + 149;
        int actual = e.calculatePrice(order);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testHasOverlappingReservations() {
        ArrayList<Reservation> reservations1 = new ArrayList();
        reservations1.add(new Reservation(3, 16, 17));
        reservations1.add(new Reservation(3, 17, 19));
        reservations1.add(new Reservation(3, 19, 20));
        reservations1.add(new Reservation(3, 20, 21));
        reservations1.add(new Reservation(3, 21, 23));
        assertFalse(e.hasOverlappingReservations(reservations1));
        
        ArrayList<Reservation> reservations2 = new ArrayList();
        reservations2.add(new Reservation(3, 16, 17));
        reservations2.add(new Reservation(3, 17, 19));
        reservations2.add(new Reservation(3, 19, 20));
        reservations2.add(new Reservation(3, 20, 22));
        reservations2.add(new Reservation(3, 21, 23));
        assertTrue(e.hasOverlappingReservations(reservations2));
    }

    @Test
    public void testGetNumberOfReservationsForTable(){
        HashMap<String, ArrayList<Reservation>> map = new HashMap<>();
        
        Table t1 = new Table("t1", 4);
        ArrayList<Reservation> reservations1 = new ArrayList();
        reservations1.add(new Reservation(3, 16, 17));
        reservations1.add(new Reservation(3, 17, 19));
        reservations1.add(new Reservation(3, 19, 20));
        reservations1.add(new Reservation(3, 20, 21));
        reservations1.add(new Reservation(3, 21, 23));
        map.put(t1.getTableId(), reservations1);
        
        Table t2 = new Table("t2", 3);
        ArrayList<Reservation> reservations2 = new ArrayList();
        reservations2.add(new Reservation(3, 16, 17));
        reservations2.add(new Reservation(3, 17, 19));
        reservations2.add(new Reservation(3, 19, 20));
        reservations2.add(new Reservation(3, 20, 22));
        reservations2.add(new Reservation(3, 21, 23));
        map.put(t2.getTableId(), reservations2);
        
        int expected = 5;
        int actual = e.getNumberOfReservationsForTable(map, t2);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSortTablesBySize(){
        ArrayList<Table> tables = new ArrayList<>();
        tables.add(new Table("t1", 2));
        tables.add(new Table("t2", 3));
        tables.add(new Table("t4", 4));
        tables.add(new Table("t5", 3));
        tables.add(new Table("t3", 8));
        tables.add(new Table("t6", 2));
        e.sortTablesBySize(tables);
        
        assertNotNull("The list has been set to null!", tables);
        
        int expected = 6;
        int actual = tables.size();
        assertEquals("The list has changed size!", expected, actual);
        for (int i = 1; i < tables.size(); i++) {
            Table table = tables.get(i);
            Table prev  = tables.get(i-1);
            if(table.getNumberOfSeats() < prev.getNumberOfSeats()){
                fail("Elements are not ordered!");
            }
        }
    }
    
    @Test
    public void testEarlyBird(){
        String time = "08:00";
        boolean expected = true;
        boolean actual = e.earlyBird(time);
        assertEquals(expected, actual);
        
        time = "16:29";
        expected = true;
        actual = e.earlyBird(time);
        assertEquals(expected, actual);
        
        time = "16:30";
        expected = false;
        actual = e.earlyBird(time);
        assertEquals(expected, actual);
        
        time = "16:31";
        expected = false;
        actual = e.earlyBird(time);
        assertEquals(expected, actual);
    }
}
