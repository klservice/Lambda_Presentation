package main.java.com.LambdaPresentation.ExampleFiles.ForUsingLambda.Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ExampleComperator {


    public static void main(String[] args) {
        List<Customer> customer = new ArrayList<>();
        customer.add(new Customer("Herman",200));
        customer.add(new Customer("Hugo",135));
        customer.add(new Customer("Hansi",354));

        customer.sort(new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        customer.add(new Customer("Bernd"));
        customer.sort((Customer c1,Customer c2)->
        {return c1.getName().compareTo(c2.getName());}
        );

        customer.add(new Customer("Albert",450.34));
        customer.sort((c1,c2)->
        {return c1.getName().compareTo(c2.getName());}
        );

        customer.add(new Customer("Christina"));
        customer.sort((c1,c2)->
                c1.getName().compareTo(c2.getName())
        );

        for(Customer customer1:customer){
            System.out.println(customer1.getName() +" "+ customer1.getCustomerBankCredit() +" €");
        }
    }
}
