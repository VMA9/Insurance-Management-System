package account;

import Exception.InvalidAuthenticationException.InvalidAuthenticationException;
import address.Address;
import authenticationstatusenum.AuthenticationStatus;
import insurance.Insurance;
import user.User;

import java.util.ArrayList;

public abstract class Account implements Comparable<Account> {
    protected User user;
    protected ArrayList<Insurance> insurances;
    protected AuthenticationStatus authStatus;

    public Account(User user) {
        this.user = user;
        this.insurances = new ArrayList<>();
        this.authStatus = AuthenticationStatus.FAIL;
    }

    public final void showUserInfo() {
        System.out.println("User Information: " + user.getFullName());
        for (Address address : user.getAddresses()) {
            System.out.println(address.getAddressDetails());
        }
    }

    public boolean login(String email, String password) throws InvalidAuthenticationException {
        if (user.login(email, password)) {
            authStatus = AuthenticationStatus.SUCCESS;
            return true;
        } else {
            throw new InvalidAuthenticationException("Invalid login attempt.");
        }
    }

    public void addAddress(Address address) {
        user.addAddress(address);
    }

    public void removeAddress(Address address) {
        user.removeAddress(address);
    }

    public AuthenticationStatus getAuthStatus() {
        return authStatus;
    }

    public void addInsurance(Insurance insurance) {
        insurances.add(insurance);
    }

    public void removeInsurance(Insurance insurance) {
        insurances.remove(insurance);
    }

    public ArrayList<Insurance> getInsurances() {
        return insurances;
    }

    @Override
    public int compareTo(Account other) {
        return this.user.getFullName().compareTo(other.user.getFullName());
    }

    @Override
    public int hashCode() {
        return user.getFullName().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Account account = (Account) obj;
        return user.getFullName().equals(account.user.getFullName());
    }

    public User getUser() {
        return user;
    }
}
