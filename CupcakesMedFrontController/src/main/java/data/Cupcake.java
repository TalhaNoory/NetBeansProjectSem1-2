/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author frederik
 */
public class Cupcake {

    @Override
    public String toString() {
        return "Cupcake{" + "cupcakeTop=" + cupcakeTop + ", cupcakeButtom=" + cupcakeButtom + ", price=" + price + '}';
    }
    private CupcakeTop cupcakeTop;
    private CupcakeButtom cupcakeButtom;
    private int price;


    public int getPrice() {
        return price;
    }
    
    public Cupcake(CupcakeTop cupcakeTop, CupcakeButtom cupcakeButtom){
        this.cupcakeButtom = cupcakeButtom;
        this.cupcakeTop = cupcakeTop;
        this.price = cupcakeTop.getPrice() + cupcakeButtom.getPrice();
    }
}
