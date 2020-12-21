package repetition2;

public class Student {

    private static final String CLASS_ID = "cph-DAT-1sem";
    private String name;
    private int age;

    public Student(String name, int age) throws IllegalAgeException  {
        if(age < 18) {
            throw new IllegalAgeException("You must be legal age to be student");
        }
        this.age = age;
        this.name = name;
    }

    public String getClassId() {
        return CLASS_ID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "name=" + name + ", age=" + age + " id " + CLASS_ID;
    }
    
    public static void main(String[] args) {
        try {
            Student s1 = new Student("Tommy", 20);
            Student s2 = new Student("Hamad", 17);
            Student s3 = new Student("Mia", 25);
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s3);
        } catch (IllegalAgeException ex) {
            System.out.println(ex.getMessage());
        }
      
            
    }
}
