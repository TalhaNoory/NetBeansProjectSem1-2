package exceptions.pkg2;

import java.util.ArrayList;

public class MySystem {

    ArrayList<BrugerNavn> loggedinbrugere;
    ArrayList<BrugerNavn> allebrugere;

    public void login(String navn) {
        for (int i = 0; i < allebrugere.size(); i++) {
            if (navn.equals(allebrugere.get(i).brugernavn)){
                loggedinbrugere.add(allebrugere.get(i));
                return;
            } else {
                throw new IllegalArgumentException
                ("Navn eller Pass indtastet forkert");
            }
        }
    }

    public void logout(String navn) {
        for (int i = 0; i < loggedinbrugere.size(); i++) {
            if (navn.equals(loggedinbrugere.get(i).brugernavn)){
                loggedinbrugere.remove(i);
                return;
            }            
        }                                                            
    }
    
    public int Counterlogins (String navn) throws NotLoggedInException{
        for (int i = 0; i < loggedinbrugere.size(); i++) {
            if(navn.equals(loggedinbrugere.get(i).brugernavn)){
                return loggedinbrugere.size();
            }
        }
        throw new NotLoggedInException("Brugeren er ikke logget ind");
    }
    
    /*public int generator (){
        if ()
    }*/
}
        
        
    
    
    
    

