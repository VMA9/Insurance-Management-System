package insurance;

import java.time.LocalDate;

public class TravelInsurance extends Insurance {
    public TravelInsurance(String name, double fee, LocalDate startDate, LocalDate endDate) {
        super(name, fee, startDate, endDate);
    }

    @Override
    public double calculate() {
        return fee * 1.08;
    }
}