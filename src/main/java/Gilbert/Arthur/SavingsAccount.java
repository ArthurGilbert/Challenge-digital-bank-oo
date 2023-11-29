package Gilbert.Arthur;

public class SavingsAccount extends Account{

    public SavingsAccount(Client client) {
        super(client);
    }

    @Override
    public void printExtract() {
        System.out.println("*** Savings account statement ***\n");
        super.printInfoCommon();
    }
}
