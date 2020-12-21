package opgave1;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringsTest {

    Strings strings = new Strings();

    // Test opgave 1A
    @Test
    public void testgenerateSQLStringWithOneColumn() {
        String[] columns = {"ID"};
        String tableName = "PERSON";
        String actualSQLString = strings.makeSQLString(columns, tableName);
        String expectedSQLString = "select ID from PERSON;";
        assertEquals(expectedSQLString, actualSQLString);
    }

    @Test
    public void testgenerateSQLStringWithThreeColumns() {
        String[] columns = {"id", "name", "phone"};
        String tableName = "person";
        String actualSQLString = strings.makeSQLString(columns, tableName);
        String expectedSQLString = "select id, name, phone from person;";
        assertEquals(expectedSQLString, actualSQLString);
    }

    // Test opgave 1B
    @Test
    public void testStringInLowerCase() {
        assertTrue(strings.isLowerCase("abcdefg"));
    }

    @Test
    public void testStringInUpperCase() {
        assertFalse(strings.isLowerCase("ABCDEFG"));
    }

    @Test
    public void testStringWithOneLetterInUpperCase() {
        assertFalse(strings.isLowerCase("cgvwXa"));
    }

    @Test
    public void testStringWithInteger() {
        assertFalse(strings.isLowerCase("2bcæ"));
    }

    @Test
    public void testEmptyString() {
        assertTrue(strings.isLowerCase(""));
    }

    @Test
    public void testNoString() {
        assertFalse(strings.isLowerCase(null));
    }

    //Test opgave 1C
    @Test
    public void testStringIsSameBackwards() {       
        assertTrue(strings.isSameBackwards("aibohphobia"));
    }

    @Test
    public void testStringIsSameBackwardsCaseInsensitiv() {        
        assertTrue(strings.isSameBackwards("A santa at NASA"));
    }
    
    @Test
    public void testStringIsNotSameBackwards() {
        assertFalse(strings.isSameBackwards("The tuba is cool"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testStringIsNull() {
        strings.isSameBackwards(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testStringIsEmpty() {
        strings.isSameBackwards("");
    }

}
