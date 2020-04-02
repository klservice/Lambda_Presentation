package main.java.com.LambdaPresentation.ExampleFiles.ForUsingLambda;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExampleActionListener {

    public static void main(String[] args) {
        JButton buttonWithoutLambda = new JButton("Without Lambda");
        JButton buttonWithLambda = new JButton("With Lambda");
        JLabel textLabel = new JLabel("Text here");
        buttonWithoutLambda.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Cilck Detected by Anonymous Class.");
                textLabel.setText("Click Detected by Anonymous Class.");
            }
        });

        buttonWithLambda.addActionListener(e -> {
            System.out.println("Click detected by Lambda Expression.");
            textLabel.setText("Click Detected by Lambda Expression.");
        });

        buttonWithLambda.setSize(400,50);
        buttonWithoutLambda.setSize(400,50);

        textLabel.setSize(400,20);
        JFrame frame= new JFrame("Example for ActionListener");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(buttonWithLambda,BorderLayout.NORTH);

        frame.add(buttonWithoutLambda, BorderLayout.CENTER);
        frame.add(textLabel,BorderLayout.AFTER_LAST_LINE);


        frame.setSize(400,150);
        frame.setVisible(true);
    }
}
