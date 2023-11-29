package Gilbert.Arthur;

public interface IAccount {

    void withdraw(double value);

    void deposit(double value);

    void transfer(double value, IAccount accountDestination);

    void printExtract();
}
