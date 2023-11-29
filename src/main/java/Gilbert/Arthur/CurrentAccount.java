package Gilbert.Arthur;

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
