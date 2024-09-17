package user;

import address.Address;

import java.util.ArrayList;
import java.time.LocalDate;

public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String job;
    private int age;
    private ArrayList<Address> addresses;
    private LocalDate lastLogin;

    public User(String firstName, String lastName, String email, String password, String job, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.job = job;
        this.age = age;
        this.addresses = new ArrayList<>();
        this.lastLogin = LocalDate.now();
    }

    public void addAddress(Address address) {
        addresses.add(address);
    }

    public void removeAddress(Address address) {
        addresses.remove(address);
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public boolean login(String email, String password) {
        return this.email.equals(email) && this.password.equals(password);
    }

    public ArrayList<Address> getAddresses() {
        return addresses;
    }
    public LocalDate getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(LocalDate lastLogin) {
        this.lastLogin = lastLogin;
    }
}