package main.java.com.LambdaPresentation.advantagesOfJava8;

interface HelloInterface {
    void displayHello();
}

class HelloInterfaceImplementation implements HelloInterface {
    @Override
    public void displayHello() {
        System.out.println("Hello");
    }
}

public class BeforeJava8 {
    public static void main(String[] args) {
        HelloInterface helloInterface = new HelloInterfaceImplementation();
        helloInterface.displayHello();
    }
}
