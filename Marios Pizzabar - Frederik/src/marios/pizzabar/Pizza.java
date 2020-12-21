
package marios.pizzabar;


public class Pizza {
    private final String pizzaNavn;
    private final int pizzaPrize;
    private final int pizzaNr;

    public Pizza(String pizzaNavn, int pizzaPrize, int pizzaNr) {
        this.pizzaNavn = pizzaNavn;
        this.pizzaPrize = pizzaPrize;
        this.pizzaNr = pizzaNr;
    }

    public String getPizzaNavn() {
        return pizzaNavn;
    }

    public int getPizzaPrize() {
        return pizzaPrize;
    }

    public int getPizzaNr() {
        return pizzaNr;
    }
}
