package insurance;

import java.time.LocalDate;

public abstract class Insurance {
    protected String name;
    protected double fee;
    protected LocalDate startDate;
    protected LocalDate endDate;

    public Insurance(String name, double fee, LocalDate startDate, LocalDate endDate) {
        this.name = name;
        this.fee = fee;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public abstract double calculate();

    // Getter ve setter metodları
    public String getName() {
        return name;
    }

    public double getFee() {
        return fee;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }
}