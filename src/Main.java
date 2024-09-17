import account.Account;
import account.AccountManager;
import account.Enterprise;
import account.Individual;
import address.Address;
import address.BusinessAddress;
import address.HomeAddress;
import insurance.CarInsurance;
import insurance.HealthInsurance;
import loginmanager.LoginManager;
import user.User;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        AccountManager accountManager = new AccountManager();

        User user1 = new User("John", "Doe", "john@example.com", "password123", "Engineer", 30);
        Account individualAccount = new Individual(user1);

        User user2 = new User("Alice", "Smith", "alice@company.com", "securePass", "CEO", 45);
        Account enterpriseAccount = new Enterprise(user2);

        accountManager.addAccount(individualAccount);
        accountManager.addAccount(enterpriseAccount);

        Address homeAddress = new HomeAddress("123 Main St", "New York", "USA");
        Address businessAddress = new BusinessAddress("Company123","456 Corporate Blvd", "New York", "USA");
        individualAccount.addAddress(homeAddress);
        enterpriseAccount.addAddress(businessAddress);

        individualAccount.addInsurance(new CarInsurance("Car Insurance", 1000.0, LocalDate.now(), LocalDate.now().plusYears(1)));
        enterpriseAccount.addInsurance(new HealthInsurance("Health Insurance", 5000.0, LocalDate.now(), LocalDate.now().plusYears(1)));

        LoginManager loginManager = new LoginManager(accountManager);

        Account account = loginManager.login();
        if (account != null) {
            account.showUserInfo();

            System.out.println("\nInsurance Policies:");
            account.getInsurances().forEach(insurance -> {
                System.out.println("Insurance: " + insurance.getName() +
                                   ", Fee: " + insurance.getFee() +
                                   ", Start: " + insurance.getStartDate() +
                                   ", Finish: " + insurance.getEndDate());
            });

            Address newHomeAddress = new HomeAddress("789 New St", "New York", "USA");
            account.addAddress(newHomeAddress);
            account.removeAddress(homeAddress);

            System.out.println("\nUpdated Addresses:");
            account.getUser().getAddresses().forEach(address -> {
                System.out.println(address.getAddressDetails());
            });
        } else {
            System.out.println("Login failed.");
        }
    }
}