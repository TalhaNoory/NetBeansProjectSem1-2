package teamwork;

import java.util.Objects;

public class User {
    private int Id;
    private String Username;
    private String Password;
    private boolean Admin;

    public User(int Id, String Userame, String Password, boolean Admin) {
        this.Id = Id;
        this.Username = Userame;
        this.Password = Password;
        this.Admin = Admin;
    }

    @Override
    public String toString() {
        return "User{" + "ID=" + Id + ", Userame=" + Username + ", Password=" + Password + ", Admin=" + Admin + '}';
    }

    public int getId() {
        return Id;
    }

    public void setID(int ID) {
        this.Id = ID;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Userame) {
        this.Username = Userame;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public boolean isAdmin() {
        return Admin;
    }

    public void setAdmin(boolean Admin) {
        this.Admin = Admin;
    }

    
}