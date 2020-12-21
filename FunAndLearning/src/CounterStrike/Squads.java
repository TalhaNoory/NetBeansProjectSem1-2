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
public class Squads {
    
    private String name;
    private String weapon;
    private int teamTag;
    private double money;

    public Squads(String name, String weapon, int teamTag, double money) {
        this.name = name;
        this.weapon = weapon;
        this.teamTag = teamTag;
        this.money = money;
    }

    public String getName() {
        return "Mr. " + name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getTeamTag() {
        return teamTag;
    }

    public void setTeamTag(int teamTag) {
        this.teamTag = teamTag;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    
    
    @Override
    public String toString() {
        return "{The name of this member is: "+name + "}" + "\nHis tag number is: " + teamTag + "\nAmount of money this member has: " + money + "\nThis member is carrying a: " + weapon;
    }
    
}
