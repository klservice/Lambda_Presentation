package main.java.com.LambdaPresentation_II.AnonToLambda;

public class AusgabeOOP {

    public void display(){
        System.out.println("DisplayMethode Aufruf.");
    }

    /*
    ______ void display(){
        System.out.println("DisplayMethode Aufruf.");
    }
    */


    /*
    public void display(Displaying displaying){
        displaying.displayPerform();
    }
    */

    public static void main(String[] args) {
        AusgabeOOP ausgabeOOP = new AusgabeOOP();
        ausgabeOOP.display();
    }
}
