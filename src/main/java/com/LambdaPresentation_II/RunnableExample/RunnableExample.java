package main.java.com.LambdaPresentation_II.RunnableExample;

public class RunnableExample {

    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Without Lambda Expression: ");
                System.out.println("Hello guys from Logopak.");
            }
        };

        Runnable r2 = ()->{
            System.out.println("With Lambda Expression: ");
            System.out.println("Hello guys from Logopak.");
        };

        r1.run();
        r2.run();
    }
}
