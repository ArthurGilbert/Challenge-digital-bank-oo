package Gilbert.Arthur;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Account implements IAccount {

    private static final int STANDARD_AGENCY = 1;
    private  static int SEQUENTIAL = 1;

    protected int agency;
    protected  int number;
    protected  double balance;
    protected Client client;

    public Account(Client client) {
        this.agency = Account.STANDARD_AGENCY;
        this.number = SEQUENTIAL++;
        this.client = client;
        AccountManager.addAccount(this);
    }

    @Override
    public void withdraw(double value) {
        balance -= value;
    }

    @Override
    public void deposit(double  value) {
        balance += value;
    }

    @Override
    public void transfer(double value, IAccount accountDestination) {
        this.withdraw(value);
        accountDestination.deposit(value);
    }


    protected void printInfoCommon() {
        System.out.println(String.format("Proprietor: %s", this.client.getName()));
        System.out.println(String.format("Agency: %d", this.agency));
        System.out.println(String.format("Number: %d", this.number));
        System.out.println(String.format("Balance: %.2f\n", this.balance));
    }
}
