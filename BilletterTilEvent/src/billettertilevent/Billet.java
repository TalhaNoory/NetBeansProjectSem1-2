package billettertilevent;

public abstract class Billet {

    private int id;
    private int price;
    private String type;

    public Billet(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public String getType(){
        return type;
    }
    
    public void setType(String type){
        this.type = type;
    }
    
    @Override
    public String toString(){
        return "ID " + getId() +  " Pris " + getPrice() + " for en DørBillet ";
    }
}
