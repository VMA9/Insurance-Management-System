package loginmanager;

import Exception.InvalidAuthenticationException.InvalidAuthenticationException;
import account.Account;
import account.AccountManager;

import java.util.Scanner;

public class LoginManager{
    private AccountManager accountManager;

    public LoginManager(AccountManager accountManager) {
        this.accountManager = accountManager;
    }

    public Account login() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Password: ");
        String password = scanner.nextLine();

        try {
            Account account = accountManager.login(email, password);
            System.out.println("Login successful!");
            return account;
        } catch (InvalidAuthenticationException e) {
            System.out.println("Login failed: " + e.getMessage());
        }

        return null;
    }
}