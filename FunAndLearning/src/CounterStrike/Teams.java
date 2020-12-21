/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CounterStrike;

/**
 *
 * @author Dhono
 */
public class Teams {

    public static void main(String[] args) {
    
    Squads s = new Squads("Talha", "AWP", 5, 11000.00);

//        System.out.println(s);
    System.out.println (s.getName

() + "\n" + s.getWeapon());
    }
    /*
    void setName (String name) {
        this.name = name;
    }
    
    public String getName () {
        return name;
    }
    
    void setWeapon (String weapon) {
        this.weapon = weapon;
    }
    
    public String getWeapon () {
        return weapon;
    }
    
    void setTeamTag (int teamTag) {
        this.teamTag = teamTag;
    }
    
    public int getTeamTag () {
        return teamTag;
    }
    
    void setMoney (double money) {
        this.money = money;
    }
    
    public double getMoney () {
        return money;
    }
    */
}
