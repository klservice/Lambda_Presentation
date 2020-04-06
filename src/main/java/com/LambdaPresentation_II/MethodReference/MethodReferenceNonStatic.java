package main.java.com.LambdaPresentation_II.MethodReference;

import main.java.com.LambdaPresentation.ExampleFiles.MethodReferences.IMethodReference;

public class MethodReferenceNonStatic {

    void displayMessage(){
        System.out.println("Display Message form Method Reference");
    }

    public static void main(String[] args) {

     //   MethodReferenceNonStatic methodReferenceNonStatic = new MethodReferenceNonStatic();
     //   MethodReferenceNonStatic methodReferenceNonStatic = MethodReferenceNonStatic::displayMessage;

        MethodReferenceNonStatic obj = new MethodReferenceNonStatic();
        IMethodReference methodReference = obj::displayMessage;
        methodReference.helloMethodReference();
    }

}
