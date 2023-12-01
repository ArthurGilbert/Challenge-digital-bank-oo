package Gilbert.Arthur;

import Gilbert.Arthur.Account.Account;
import Gilbert.Arthur.Account.AccountManager;
import Gilbert.Arthur.Account.TypesAccounts.CurrentAccount;
import Gilbert.Arthur.Account.TypesAccounts.SavingsAccount;
import Gilbert.Arthur.Client.Client;
import Gilbert.Arthur.Client.ClientManager;

public class Main {
    public static void main(String[] args) {

        Client arthur = new Client("Arthur", "123456789");

        Client maria = new Client("Maria", "987654321");

        Client pedro = new Client("Pedro", "456789123");

        Client error1 = new Client("Pedro", "456789123");

        Client test1 = new Client("Pedro", "456789124");

        Account ca = new CurrentAccount(arthur);
        Account sa = new SavingsAccount(arthur);

        Account ca2 = new CurrentAccount(maria);
        Account sa2 = new SavingsAccount(maria);

        Account ca3 = new CurrentAccount(pedro);

        Account ca4 = new CurrentAccount(test1);

        ca.deposit(100);
        ca.transfer(100, sa);

        ca2.deposit(500);
        ca2.transfer(200, sa2);

        ca3.deposit(300);
        ca3.transfer(100, sa);

        ca4.deposit(900);
        ca4.withdraw(100);

        ca.printExtract();
        sa.printExtract();

        ca2.printExtract();
        sa2.printExtract();

        ca3.printExtract();

        ca4.printExtract();

        // Calling the method to get the information from the customers
        String clientsInfo = ClientManager.getClientsInfo();
        System.out.println(clientsInfo);

        // Example of a better encapsulation keeping all the logic in its class
        AccountManager.listAllAccounts();

    }
}