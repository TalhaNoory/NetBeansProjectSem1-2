/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glarmester.logic;

import glarmester.data.DBConnector;
import glarmester.data.DataAccessor;
import glarmester.data.DataAccessorDB;
import glarmester.data.DataException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class ControllerImplTest{
    
    private DBConnector c;
    private DataAccessorDB dao;
    private PriceCalculator calc;
    
    //private DBConnector c = null;
    
    //private ControllerImpl instance = ControllerImpl(data, logic);

    public ControllerImplTest() {
//        this.c = new DBConnector();
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws DataException {
        try {
            c = new DBConnector();
            dao = new DataAccessorDB(c);
            calc = new PriceCalculator();
        } catch (SQLException ex) {
            throw new DataException(ex);
        }
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getFrameNames method, of class ControllerImpl.
     */
    @Test
    public void testGetFrameNames() {
        //System.out.println("getFrameNames");
        ControllerImpl instance = new ControllerImpl(dao, calc);
        List<String> expResult = new ArrayList<>();
        expResult.add("Plain");
        expResult.add("Ornate");
        expResult.add("Lavish");
        List<String> result = instance.getFrameNames();
        assertEquals(expResult.size(), result.size());
    }

    /**
     * Test of getTotalPrice method, of class ControllerImpl.
     */
    @Test
    public void testGetTotalPrice() {
        System.out.println("getTotalPrice");
        int height_cm = 100;
        int width_cm = 100;
        String frameName = "Ornate";
        ControllerImpl instance = new ControllerImpl(dao, calc);
        // 1m*1m glass = 300kr 4m ornate frame = 800kr i alt 1100kr
        double expResult = 1100.0;
        double result = instance.getTotalPrice(height_cm, width_cm, frameName);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
