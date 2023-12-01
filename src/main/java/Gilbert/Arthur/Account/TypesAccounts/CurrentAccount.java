package Gilbert.Arthur.Account.TypesAccounts;

import Gilbert.Arthur.Account.Account;
import Gilbert.Arthur.Client.Client;

public class CurrentAccount extends Account {

    public CurrentAccount(Client client) {
        super(client);
    }

    @Override
    public void printExtract() {
        System.out.println("*** Current account statement ***\n");
        super.printInfoCommon();
    }
}
