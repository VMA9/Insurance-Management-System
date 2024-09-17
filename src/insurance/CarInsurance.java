package insurance;

import java.time.LocalDate;

public class CarInsurance extends Insurance {
    public CarInsurance(String name, double fee, LocalDate startDate, LocalDate endDate) {
        super(name, fee, startDate, endDate);
    }

    @Override
    public double calculate() {
        return fee * 1.15;
    }
}