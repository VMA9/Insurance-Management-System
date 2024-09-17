package account;

import insurance.Insurance;
import user.User;

public class Enterprise extends Account {
    public Enterprise(User user) {
        super(user);
    }

    @Override
    public void addInsurance(Insurance insurance) {
        insurances.add(insurance);
    }
}