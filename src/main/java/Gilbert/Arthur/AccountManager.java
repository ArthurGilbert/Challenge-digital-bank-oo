package Gilbert.Arthur;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AccountManager {
    private static List<Account> accounts = new ArrayList<>();
    private static Set<Client> clients = new HashSet<>();

    public static void addAccount(Account account) {
        accounts.add(account);
        clients.add(account.getClient());
    }

    public static List<Account> getAccounts() {
        return accounts;
    }

    public static List<Client> getClients() {
        return new ArrayList<>(clients);
    }
}