package trialexam;

public class Table implements Comparable<Table> {
    private String tableId;
    private int numberOfSeats;

    public Table(String tableId, int numberOfSeats) {
        this.tableId = tableId;
        this.numberOfSeats = numberOfSeats;
    }

    public String getTableId() {
        return tableId;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public String toString() {
        return "Table: " + tableId + "\t(Number of seats=" + numberOfSeats + ')';
    }

    @Override
    public int compareTo(Table other) {
        return this.tableId.compareTo(other.tableId);
    }
}
