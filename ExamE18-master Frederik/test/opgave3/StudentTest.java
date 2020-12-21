package opgave3;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class StudentTest {

    Students s = new Students();
    ArrayList<Student> all = new ArrayList();

    //Test opgave 3A
    @Before
    public void setup() {
        all.add(new Student("cph-18-al", "Alice", Education.COMPUTER_SCIENCE));
        all.add(new Student("cph-18-bo", "Bo", Education.ECONOMY));
        all.add(new Student("cph-18-si", "Simon", Education.COMPUTER_SCIENCE));
        all.add(new Student("cph-18-ab", "Abraham", Education.MULTIMEDIA));
        all.add(new Student("cph-18-pe", "Peter", Education.COMPUTER_SCIENCE));
        all.add(new Student("cph-18-he", "Helle", Education.MULTIMEDIA));
    }

    
    @Test
    public void testComputerScienceStudentIsCreated() {
        Student student = all.get(0);
        assertEquals("cph-18-al", student.getstudyId());
        assertEquals("Alice", student.getName());
        assertEquals(Education.COMPUTER_SCIENCE, student.getProgram());
    }

    @Test
    public void testMultiMediaStudentisCreated() {
        Student student = all.get(3);
        assertEquals("cph-18-ab", student.getstudyId());
        assertEquals("Abraham", student.getName());
        assertEquals(Education.MULTIMEDIA, student.getProgram());
    }

    //opgave 3B
    @Test
    public void testRetrieveStudentById() {
        Student student = s.retrieveStudent(all, "cph-18-si");
        assertEquals("cph-18-si", student.getstudyId());
        assertEquals("Simon", student.getName());
        assertEquals(Education.COMPUTER_SCIENCE, student.getProgram());

    }

    @Test
    public void testRetrieveStudentByNonExistingId() {
        Student student = s.retrieveStudent(all, "cph-18-xx");
        assertNull(student);
    }
    
    //Test opgave 3C
    @Test
    public void testRetrieveStudentsOnMultiMediaProgram() {
        ArrayList<Student> result = s.retrieveStudents(all, Education.MULTIMEDIA);
        assertEquals(2, result.size());
        assertEquals(Education.MULTIMEDIA, result.get(0).getProgram());
        assertEquals(Education.MULTIMEDIA, result.get(1).getProgram());
    }

    @Test
    public void testRetrieveStudentsOnComputerScienceProgram() {
        ArrayList<Student> result = s.retrieveStudents(all, Education.COMPUTER_SCIENCE);
        assertEquals(3, result.size());
        assertEquals(Education.COMPUTER_SCIENCE, result.get(0).getProgram());
        assertEquals(Education.COMPUTER_SCIENCE, result.get(1).getProgram());
        assertEquals(Education.COMPUTER_SCIENCE, result.get(2).getProgram());
    }
}
