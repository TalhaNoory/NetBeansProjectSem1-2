package petclinic;

import java.time.LocalDate;

public class PetClinic {

    public static void main(String[] args) {
        Person person1 = new Person("Stan", "Gregor", "234 Highland Street", 
                "2016-09-10"); // opretter Person1
        Person person2 = new Person("Baner", "Bruce", "983 Dyringparken", 
                "2017-10-11"); // opretter Person1
        Pet pet1 = new Pet("Molly", PetType.DOG, LocalDate.now(), person1); // opretter Pet1
        Pet pet2 = new Pet("Frida", PetType.CAT, LocalDate.now(), person2); //opretter Pet2
                        
        System.out.println(pet1);
        
        
        
        
    }
}
