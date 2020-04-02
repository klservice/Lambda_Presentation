package main.java.com.LambdaPresentation.ExampleFiles.FunctionalInterface;

public interface ExampleSimpleInterface {

    void display();

    default int bodySize(){
        return 0;
    }

    static double calcWeight() {
        return 0;
    }

}
