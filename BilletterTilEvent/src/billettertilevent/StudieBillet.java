
package billettertilevent;

public class StudieBillet extends Billet {
    private int gprice = 65;
    private int aep = 15;
    private int studiekortid;
    
    /* Her hentes (id) fra Class Billet med hjælp fra super
    samt setPrice() som også er hentet fra Class Billet */
    public StudieBillet(int id, int studiekortid) {
        super(id);
        super.setPrice(gprice);
        this.studiekortid = studiekortid;
        
    }
    
    
//    public void setAfterEventPrice(){
//        super.setPrice(gprice + aep);
//    }
    
    /* Her er prisen når man købet billetten efter eventet 
    + grundprisen, 
    samtidig med at man også skal have et Studiekortid */
    public int getStudieKortId(){
        return gprice + aep;
    }
    
}
  
   
    

