package petclinic;

import java.time.LocalDate;

public class Visits {
    private LocalDate dateOfVisits;
    private String description;

    public Visits(LocalDate dateOfVisits, String description) {
        this.dateOfVisits = dateOfVisits;
        this.description = description;
    }

    public LocalDate getDateOfVisits() {
        return dateOfVisits;
    }

    public void setDateOfVisits(LocalDate dateOfVisits) {
        this.dateOfVisits = dateOfVisits;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
