package Gilbert.Arthur.Account;

import java.util.ArrayList;
import java.util.List;

public class AccountManager {
    private static List<Account> accounts = new ArrayList<>();

    public static void addAccount(Account account) {
        accounts.add(account);
    }

    public static List<Account> getAccounts() {

        return accounts;
    }

    public static void listAllAccounts() {
        System.out.println("\n*** List of Accounts ***\n");
        for (Account account : accounts) {
            System.out.println("Account Number: " + account.getNumber());
        }
    }

}