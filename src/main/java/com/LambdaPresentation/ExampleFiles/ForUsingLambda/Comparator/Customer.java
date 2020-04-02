package main.java.com.LambdaPresentation.ExampleFiles.ForUsingLambda.Comparator;

public class Customer {
    private String name;
    private double customerBankCredit = 0;

    public Customer(String name) {this.name = name;}

    public Customer(String name, double monyCredit) {
        this.name = name;
        this.customerBankCredit = monyCredit;
    }

    public String getName() {
        return this.name;
    }

    public double getCustomerBankCredit() {
        return this.customerBankCredit;
    }
}
