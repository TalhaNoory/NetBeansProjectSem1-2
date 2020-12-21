package TicketMachine;

public class TicketMachine {

    public double calculatePrice(double time, Enum zone, Enum payment) {
        double price = 0;
        double hours = time / 60.0;
//        if (time % 30 != 0 || time < 0)
//            throw new IllegalArgumentException("Din indtastning var forkert. Indtast venligst tid i minutter rundet op til nærmeste halve time");
//
//        else {
            if (zone == Zone.RED) {
                price = hours * 36;
            } else if (zone == Zone.GREEN) {
                price = hours * 19;
            } else if (zone == Zone.BLUE) {
                price = hours * 12;
            } else if (zone == Zone.YELLOW) {
                price = hours * 9;
            }
            if (payment == Payment.CARD) {
                price += 0.5;
            }
//        }
        return price;

    }
}
