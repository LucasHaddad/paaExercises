package exercise3;

public class Customer {

    private int number;
    private String name;

    public Customer(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }
}