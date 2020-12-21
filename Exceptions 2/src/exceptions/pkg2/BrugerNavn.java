package exceptions.pkg2;

public class BrugerNavn {
    
    public String brugernavn;
    public String password;
    public int count;
    
    public BrugerNavn (String brugernavn, String password){
        this.brugernavn = brugernavn;
        this.password = password;
        count ++;
    }

}
