package main.java.com.LambdaPresentation.WayFromAnonToLambda;


public class AnonToLambda {

    private void display(Displaying displaying){
       System.out.println("Hallo I'am there.");
        //  displaying.displayPerfrom();
    }



    public static void main(String[] args) {
        AnonToLambda anonToLambda = new AnonToLambda();
        DisplayMessageImplementation dmi = new DisplayMessageImplementation();
        anonToLambda.display(dmi);
//        Displaying displayWithLambda = () -> System.out.println("Hello i'm also here.");
//
//        displayWithLambda.displayPerfrom();

      //  dubleNumberFunction = (int a) -> a*2;
        Calc calulate = (int a, int b)->a+b;
        int value = calulate.sumInteger(23,76);
        System.out.println(value);

    }
}
