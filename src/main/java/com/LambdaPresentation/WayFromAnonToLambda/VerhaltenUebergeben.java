package main.java.com.LambdaPresentation.WayFromAnonToLambda;

public class VerhaltenUebergeben {

    public void display(Displaying displaying){
        displaying.displayPerfrom();
        System.out.println("Hallo ich werde gerade Ausgegeben. Nicht lambda");
    }
   // display = public void display(Displaying displaying){
   //     displaying.displayPerfrom();
   // }
    public static void main(String[] args) {
        VerhaltenUebergeben verhaltenUebergeben = new VerhaltenUebergeben();
        VerhaltenImplementieren displaying = new VerhaltenImplementieren();
        verhaltenUebergeben.display(displaying);

        
       /*Displaying display = ()->System.out.println("Hallo ich werde gerade Ausgegeben. Lambda");
       display.displayPerfrom();*/

       // Displaying displaying = ()->System.out.println("Hallo ich werde gerade Ausgegeben.");



    }

}
