package exercise3;

public class Account {

    private final double REMOVAL_TAX = 1.1;

    private int number;
    private double balance;
    private Customer owner;

    public Account(Customer owner, int number) {
        this.owner = owner;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public Customer getOwner() {
        return owner;
    }

    public void deposit(double value) {
        balance += value;
    }

    private void doTransfer(double value, Account destiny) {
        destiny.deposit(value);
    }

    private boolean changeBalance(double value, double tax) {
        if (balance >= (value * tax)) {
            balance -= value;
            return true;
        }
        return false;
    }

    public double withdraw(double value) {
        return changeBalance(value, REMOVAL_TAX) ? value : 0.0;
    }

    public double transfer(double value, Account destiny) {
        if (changeBalance(value, REMOVAL_TAX)) {
            doTransfer(value, destiny);
            return value;
        }
        return 0.0;
    }

}