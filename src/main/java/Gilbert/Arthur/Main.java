package Gilbert.Arthur;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Client arthur = new Client();
        arthur.setName("Arthur");

        Client maria = new Client();
        maria.setName("Maria");

        Client pedro = new Client();
        pedro.setName("Pedro");

        Account ca = new CurrentAccount(arthur);
        Account sa = new SavingsAccount(arthur);

        Account ca2 = new CurrentAccount(maria);
        Account sa2 = new SavingsAccount(maria);

        Account ca3 = new CurrentAccount(pedro);

        ca.deposit(100);
        ca.transfer(100, sa);

        ca2.deposit(500);
        ca2.transfer(200, sa2);

        ca3.deposit(300);
        ca3.transfer(100, sa);

        ca.printExtract();
        sa.printExtract();

        ca2.printExtract();
        sa2.printExtract();

        ca3.printExtract();

        List<Client> clients = AccountManager.getClients();
        System.out.println("*** List of clients ***\n");
        for (Client client : clients) {
            System.out.println(client.getName());
        }

        List<Account> accounts = AccountManager.getAccounts();
        System.out.println("\n*** List of Accounts ***\n");
        for (Account account : accounts) {
            System.out.println("Account Number: " + account.getNumber());
        }

    }
}