package opgave2;

import org.junit.Test;
import static org.junit.Assert.*;

public class LabelMakerTest {

    LabelMaker labelMaker = new LabelMaker();

    // Test opgave 2A
    @Test
    public void testgetValidCity() throws NotFoundZipcodeException {
        String zipCode = "2800";
        String expResult = "Kgs Lyngby";
        String result = labelMaker.getCity(zipCode);
        assertEquals(expResult, result);
    }

   @Test(expected = NotFoundZipcodeException.class)
    public void testgetNotExistingCity() throws NotFoundZipcodeException {
        String zipCode = "3000";
        String expResult = "";
        String result = labelMaker.getCity(zipCode);
    }

    @Test(expected = NotFoundZipcodeException.class)
    public void testgetNonsenseCity() throws NotFoundZipcodeException {
        String zipCode = "222";
        String expResult = "";
        String result = labelMaker.getCity(zipCode);
    }

    // Test opgave 2B
    @Test
    public void testMakeLabelForKgsLyngby() throws NotFoundZipcodeException {
        String name = "Hans Simonsen";
        String adress = "Hovedgaden 18A";
        String zipCode = "2800";
        String expResult = "Hans Simonsen Hovedgaden 18A 2800 Kgs Lyngby";
        String result = labelMaker.makeLabel(name, adress, zipCode);
        assertEquals(expResult, result);
    }

    @Test(expected = NotFoundZipcodeException.class)
    public void testMakeLabelForNonExistingCity() throws NotFoundZipcodeException {
        String name = "Hans Simonsen";
        String adress = "Hovedgaden 18A";
        String zipCode = "3000";
        labelMaker.makeLabel(name, adress, zipCode);
    }

}
