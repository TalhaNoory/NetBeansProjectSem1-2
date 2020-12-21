package billettertilevent;

public class BilletIForsalg extends Billet {
    private int gprice = 100;
    private int ap = 20;

    /* Her sættes 2 super, som er id, fra attributten i class Billet, 
    det samme med setPrice(), som også er fra class Billet */
    public BilletIForsalg(int id) {
        super(id);
        super.setPrice(gprice);
    }
    
//    public void setAfterPrice(){
//        super.setPrice(gprice + ap);
//    }
    
    /* Her sættes værdien for prisen når man køber den sent */
    public int getAfterPrice(){
        return gprice + ap;
    }

}
