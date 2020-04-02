package main.java.com.LambdaPresentation.ExampleFiles.FunctionalInterface;

@FunctionalInterface
public interface ExampleFunctionalInterface {

    void display();

    default int calcBalance(int amount) {
        return amount;
    }
}
