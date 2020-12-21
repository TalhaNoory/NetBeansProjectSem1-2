package opgave3;

/**
 * Opgave 3A: Entity class containing Student information.
 *
 */
public class Student
{
    /**
     * Constructs a Student object.
     *
     * @param studyId String representing a unique student identifier
     * @param name String representing a student name
     * @param program constant representing a study program
     */
    private String studyId;
    private String name;
    private Education program;

    public Student(String studyId, String name, Education program) {
        this.studyId = studyId;
        this.name = name;
        this.program = program;
    }
    


    public Education getProgram()
    {
        return program;
    }

   public String getName()
    {
        return name;
    }

    public String getstudyId()
    {
        return studyId;
    }

}
