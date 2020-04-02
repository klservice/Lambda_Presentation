package main.java.com.LambdaPresentation.ExampleFiles.MethodReferences;

public class MethodReference {

    static void displayMessage(){
        System.out.println("Display Message form Method Reference");
    }

    public static void main(String[] args) {
        IMethodReference IMethodReference = MethodReference::displayMessage;
        IMethodReference.helloMethodReference();

        IMethodReference IMethodReferenceLambda = ()-> MethodReference.displayMessage();
        IMethodReferenceLambda.helloMethodReference();
    }
}
