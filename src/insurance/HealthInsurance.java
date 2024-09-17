package insurance;

import java.time.LocalDate;

public class HealthInsurance extends Insurance {
    public HealthInsurance(String name, double fee, LocalDate startDate, LocalDate endDate) {
        super(name, fee, startDate, endDate);
    }

    @Override
    public double calculate() {
        return fee * 1.1;
    }
}