package main.java.com.LambdaPresentation_II.AnonToLambda;

public class Ausgabe {


    public static void main(String[] args) {

        Displaying anonClass = new Displaying(){
            @Override
            public void perform() {
                System.out.println("Dies ist ein Test mit einer Innere Anonyme Klasse");
            }
        };
        anonClass.perform();

    }
}
