package main.java.com.LambdaPresentation.advantagesOfJava8;

@FunctionalInterface
interface FromJava8Interface{
    void displayHello();
}

public class FromJava8 {
    public static void main(String[] args) {
        FromJava8Interface fromJava8Interface = () ->System.out.println("Hello");
        fromJava8Interface.displayHello();
    }

}
