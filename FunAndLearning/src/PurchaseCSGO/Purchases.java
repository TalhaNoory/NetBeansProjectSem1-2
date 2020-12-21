/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PurchaseCSGO;

/**
 *
 * @author Dhono
 */
public class Purchases {
    
    int pistol = 320;
    int AK = 2700;
    int sniper = 4750;
    int machineGun = 2000;
    int grenade = 300;
    int nameChange = 5000;

    public int getPistol() {
        return startValue - pistol;
    }

    public void setPistol(int pistol) {
        this.pistol = pistol;
    }

    public int getAK() {
        return startValue - AK;
    }

    public void setAK(int AK) {
        this.AK = AK;
    }

    public int getSniper() {
        return sniper;
    }

    public void setSniper(int sniper) {
        this.sniper = sniper;
    }

    public int getMachineGun() {
        return machineGun;
    }

    public void setMachineGun(int machineGun) {
        this.machineGun = machineGun;
    }

    public int getGrenade() {
        return grenade;
    }

    public void setGrenade(int grenade) {
        this.grenade = grenade;
    }

    public int getNameChange() {
        return nameChange;
    }

    public void setNameChange(int nameChange) {
        this.nameChange = nameChange;
    }
    
    int purchase;
    int startValue = 16000;
    
    public Purchases (/*int pistol, int AK, int sniper, int machineGun, int grenade, int nameChange,*/) {
        /*this.pistol = pistol;
        this.AK = AK;
        this.sniper = sniper;
        this.machineGun = machineGun;
        this.grenade = grenade;
        this.nameChange = nameChange;*/
        
        
        purchase++;
        
    }
    
}
