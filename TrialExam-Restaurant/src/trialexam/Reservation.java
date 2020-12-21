package trialexam;

public class Reservation {
    private final int numberOfPeople, startTime, endTime;

    public Reservation(int numberOfPeople, int startTime, int endTime) {
        this.numberOfPeople = numberOfPeople;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public int getStartTime() {
        return startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Reservation other = (Reservation) obj;
        if (this.startTime != other.startTime) {
            return false;
        }
        if (this.endTime != other.endTime) {
            return false;
        }
        return true;
    }

}
