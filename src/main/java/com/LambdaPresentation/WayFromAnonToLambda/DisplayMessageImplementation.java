package main.java.com.LambdaPresentation.WayFromAnonToLambda;

public class DisplayMessageImplementation implements Displaying {

    @Override
    public void displayPerfrom() {
        System.out.println("Hallo I'am there.");
    }

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

    This is all what we need the create a Lambda expression

    what left is the list of arguments in the parentheses and the block of code

    the symbol to make form the left peace of code a Lambda is a arrow "->"

     aBlockOfCode =  () -> {
        System.out.println("Hallo world.");
    }

    so we've got our Lambda expression

    the curley braces we need for multi line of code or if we have the Keyword return in the block of code

    so we can make form the block of code this

    aBlockOfCode =  () ->System.out.println("Hallo world.");




  */
}
