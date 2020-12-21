package teamwork;

import java.util.ArrayList;
import java.util.Objects;

public class Team {
    private int Id;
    private String Name;
    private ArrayList<User> members = new ArrayList<>();

    public Team(int Id, String Name, ArrayList<User> members) {
        this.Id = Id;
        this.Name = Name;
        this.members = members;
    }

    @Override
    public String toString() {
        return "Team{" + "Id=" + Id + ", Name=" + Name + ", members=" + members + '}';
    }
    public ArrayList getMembers(){
        return members;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Team other = (Team) obj;
        if (this.Id != other.Id) {
            return false;
        }
        if (!Objects.equals(this.Name, other.Name)) {
            return false;
        }
        return true;
    }

  
 

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

        
}