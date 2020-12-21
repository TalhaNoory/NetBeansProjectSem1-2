package petclinic;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pet {
    private int id;
    private String name;
    private Person owner;
    private PetType type;
    private LocalDate birthday;
    private ArrayList<Visits> visits;
    
    public void addVisits (Visits v){
        visits.add(v);
    }

    public Pet(String name, Person owner, PetType type, String birthday) {
        visits = new ArrayList<>();
        this.name = name;
        this.owner = owner;
        this.type = type;
        this.birthday = LocalDate.parse(birthday);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public Enum getPetType() {
        return type;
    }

    public void setPetType(Enum PetType) {
        this.type = type;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public ArrayList<Visits> getVisits() {
        return visits;
    }

    public void setVisits(ArrayList<Visits> visits) {
        this.visits = visits;
    }
}
