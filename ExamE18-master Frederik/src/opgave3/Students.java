package opgave3;

import java.util.ArrayList;

public class Students
{

    /**
     * Opgave 3B: This method retrives a student from a list of students based
     * on study id as search criteria.
     *
     * @param all array list of student objects used as basis for search
     * @param studyId search criteria
     * @return student object matching search criteria
     */
    public Student retrieveStudent(ArrayList<Student> all, String studyId) {
        Student result = null;
        for (Student s : all) {
            if (s.getstudyId().equals(studyId)){
                result = s;
            }
        }
        return result;
    }

    /**
     * Opgave 3C: This method retrives a sublist of student from a list of
     * students based on study program as search criteria.
     *
     * @param all array list of student objects used as basis for search
     * @param education search criteria
     * @return array list of student objects matching search criteria
     */
    public ArrayList<Student> retrieveStudents(ArrayList<Student> all, Education education) {
        ArrayList<Student> studentsWithEducation = new ArrayList<>();
        for (Student s : all) {
            if (s.getProgram().equals(education)){
                studentsWithEducation.add(s);
            }
        }
        return studentsWithEducation;
    }
}
