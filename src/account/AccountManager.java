package account;

import Exception.InvalidAuthenticationException.InvalidAuthenticationException;

import java.util.TreeSet;

public class AccountManager {
    private TreeSet<Account> accounts;

    public AccountManager() {
        accounts = new TreeSet<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public Account login(String email, String password) throws InvalidAuthenticationException{
        for (Account account : accounts) {
            try {
                if (account.login(email, password)) {
                    return account;
                }
            } catch (InvalidAuthenticationException e) {
                System.out.println(e.getMessage());
            }
        }throw new InvalidAuthenticationException("Invalid email or password");
    }
}