package trialexam;

public class FamilyTable extends Table {

    private final int numberOfChildrensSeats;

    FamilyTable(String id, int numberOfSeats, int numberOfChildrensSeats) {
        super(id, numberOfSeats);
        this.numberOfChildrensSeats = numberOfChildrensSeats;
    }

    public int getNumberOfChildrensSeats() {
        return numberOfChildrensSeats;
    }
}
