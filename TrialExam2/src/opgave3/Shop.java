package opgave3;

public class Shop implements ShopInterface {
    /*a. (5 %) Implementér flg. metode, som opretter og returnerer et Customer objekt: 
 
    public Customer makeCustomer(String name, String email) 
 
    Du bør i metoden sikre, at inputparametre indeholder valide værdier (se nærmere i unit tests). */

    @Override
    public Customer makeCustomer(String name, String email) {
        if (name.equals("") || email.equals("")){
            Customer c = null;
            return c;
        }
        Customer c = new Customer(name, email);
        return c;
    }
    /*b. (5 %) Implementér flg. metode, som opretter og returnerer et Sale objekt: 
 
    public Sale makeSale (String description, double price, int qty) 
 
    Du bør i metoden sikre, at inputparametre indeholder valide værdier (se nærmere i unit tests). */

    @Override
    public Sale makeSale(String description, double price, int qty) {
        if (description.equals("") || price < 0|| qty < 0){
            Sale s = null;
            return s;
        }
        Sale s = new Sale(description, price, qty);
        return s;
    }

    /*c. (5 %) Implementér flg. metode, som knytter et Customer objekt til et Sale Objekt 
    (Hvis Sale objektet allerede har et kundeobjekt tilknyttet, knyttes det ny Customer objekt ikke til Sale objektet og der returneres false, ellers true):
    public boolean addCustomerToSale(Sale sale, Customer customer); */
    
    @Override
    public boolean addCustomerToSale(Sale sale, Customer customer) {
        if (sale.getCustomer() == null){
            sale.setCustomer(customer);
            return true;
        }
        else{
            return false;
        }
    }
    /*d. (5 %) Implementér flg. metode, som returner prisen på et salg (pris * quantity): 
    public double getSaleTotal(Sale sale); */

    @Override
    public double getSaleTotal(Sale sale) {
        return sale.getPrice() * sale.getQty();
    }

    /*e. (5 %) Implementér flg. metode, som returner den fulde information om et salg, inkl. kundeoplysninger:
    public String getFullSale(Sale sale); */
    @Override
    public String getFullSale(Sale sale) {
        String name = sale.getCustomer().getName();
        String email = sale.getCustomer().getEmail();
        String description = sale.getDescription();
        double price = sale.getPrice();
        int qty = sale.getQty();
        //String str = "kundenavn :" + name + " kunde-email: " + email + " vare: " + description + " pris: " + price + " antal: " + qty;
        String str = description + " " + qty + " " + price + " " + name + " " + email;
        return str;
    }
    
    

    
    
    
}


