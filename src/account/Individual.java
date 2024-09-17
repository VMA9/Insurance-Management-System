package account;

import insurance.Insurance;
import user.User;

public class Individual extends Account {
    public Individual(User user) {
        super(user);
    }

    @Override
    public void addInsurance(Insurance insurance) {
        insurances.add(insurance);
    }
}