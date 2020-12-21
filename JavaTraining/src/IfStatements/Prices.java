/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IfStatements;

/**
 *
 * @author Dhono
 */
public class Prices {
    
    int tastatur = 500;
    int mus = 250;
    int headset = 750;
    int mikrofon = 1000;
    
    double dinBank;

    public Prices(int dinBank/*int tastatur, int mus, int headset, int mikrofon*/) {
//        this.tastatur = tastatur;
//        this.mus = mus;
//        this.headset = headset;
//        this.mikrofon = mikrofon;

    }
    
    public int getTastatur() {
        return (int) (tastatur - dinBank);
    }

    public void setTastatur(int tastatur) {
        this.tastatur = tastatur;
    }

    public int getMus() {
        return (int) (mus - dinBank);
    }

    public void setMus(int mus) {
        this.mus = mus;
    }

    public int getHeadset() {
        return (int) (headset - dinBank);
    }

    public void setHeadset(int headset) {
        this.headset = headset;
    }

    public int getMikrofon() {
        return (int) (mikrofon - dinBank);
    }

    public void setMikrofon(int mikrofon) {
        this.mikrofon = mikrofon;
    }

    @Override
    public String toString() {
        return "The price of the purchase is; " + tastatur + mus + headset + mikrofon;
    }

    
    
}
