package main.java.com.LambdaPresentation_II.AnonToLambda;

public class AusgabeOOP {

    public void displayOld(){
        System.out.println("Call displayOld in AusgabeOOP.");
    }

    public void display(Displaying displaying) {
        displaying.perform();
    }

    public static void main(String[] args) {
        AusgabeOOP ausgabeOOP = new AusgabeOOP();
//        ausgabeOOP.displayOld();
        AusgabeImplement ausgabeImplement = new AusgabeImplement();
        ausgabeOOP.display(ausgabeImplement);




    }
}
