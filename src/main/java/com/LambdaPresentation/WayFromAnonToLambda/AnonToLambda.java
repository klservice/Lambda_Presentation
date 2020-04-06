package main.java.com.LambdaPresentation.WayFromAnonToLambda;


public class AnonToLambda {

  /* We can remove the public identifier
     aBlockOfCode =   void perform() {
        System.out.println("Hallo world.");
    }
  */
  /* We can also remove the name of the method
     aBlockOfCode =   void () {
        System.out.println("Hallo world.");
    }
  */
  /* also we can remove the return type because this will be determined from compilier
     aBlockOfCode =  () {
        System.out.println("Hallo world.");
    }
*/
  /* This is all what we need the create a Lambda expression

    what left is the list of arguments in the parentheses and the block of code

    the symbol to make form the left peace of code a Lambda is a arrow "->"

     aBlockOfCode =  () -> {
        System.out.println("Hallo world.");
    }
    */
  /*
    so we've got our Lambda expression

    the curley braces we need for multi line of code or if we have the Keyword return in the block of code

    so we can make form the block of code this

    aBlockOfCode =  () ->System.out.println("Hallo world.");
*/

   /* private void display(Displaying displaying) {

          displaying.displayPerfrom();
    }*/


    private void display() {
        System.out.println("Hallo I'am there.");
    }

    public static void main(String[] args) {
        AnonToLambda anonToLambda = new AnonToLambda();
        //   DisplayMessageImplementation dmi = new DisplayMessageImplementation();
        anonToLambda.display();

       // anonToLambda.display(dmi);
//        Displaying displayWithLambda = () -> System.out.println("Hello i'm also here.");
//
//        displayWithLambda.displayPerfrom();

        //  dubleNumberFunction = (int a) -> a*2;
        Calc calulate = (int a, int b) -> a + b;
        int value = calulate.sumInteger(23, 76);
        System.out.println(value);

    }
}
