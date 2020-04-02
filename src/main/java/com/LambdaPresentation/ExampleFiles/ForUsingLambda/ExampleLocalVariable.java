package main.java.com.LambdaPresentation.ExampleFiles.ForUsingLambda;


import java.util.Arrays;
import java.util.List;

public class ExampleLocalVariable {


    List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

    public static void main(String[] args) {
        ExampleLocalVariable obj = new ExampleLocalVariable();

        obj.integers.forEach(x -> System.out.println(x));
        // integers.forEach(x -> System.out.println(x));
    }

    private void exampleMultiline() {
        ExampleLocalVariable obj = new ExampleLocalVariable();
        obj.integers.forEach(x -> {
            integers.add(12);
            System.out.println(x);
        });
    }


    private void ExampleLocalVariable() {
        integers.forEach(x -> System.out.println(x));
        System.out.println("add Local variable from Outside Lambda Body with value of 20");
        int var = 20;
        integers.forEach(x -> System.out.println(x + var));
    }
}
