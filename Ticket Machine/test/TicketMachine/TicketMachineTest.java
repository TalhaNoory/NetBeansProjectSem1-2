/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicketMachine;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author frede
 */
public class TicketMachineTest {

    public TicketMachineTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testPayOneHourRedZoneCash() {
        TicketMachine machine = new TicketMachine();
        double price = machine.calculatePrice(60, Zone.RED, Payment.CASH);
        assertEquals(36, price, 0);
    }
    
    @Test
    public void testPayTwoAndAHalfHourGreenZoneCard() {
        TicketMachine machine = new TicketMachine();
        double price = machine.calculatePrice(150, Zone.GREEN, Payment.CARD);
        assertEquals(48, price, 0);
    }
    
    @Test
    public void testPayThreeHourYellowZoneCash() {
        TicketMachine machine = new TicketMachine();
        double price = machine.calculatePrice(180, Zone.YELLOW, Payment.CASH);
        assertEquals(27, price, 0);
    }
}
