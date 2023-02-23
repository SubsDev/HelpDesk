package org.example;

import javax.swing.*;
import java.awt.*;

public class MainMenu {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Main Menu");

        // Set the layout for the frame
        frame.setLayout(new GridLayout(5, 2));

        // Create the buttons
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");
        JButton button5 = new JButton("Button 5");
        JButton button6 = new JButton("Button 6");
        JButton button7 = new JButton("Button 7");
        JButton button8 = new JButton("Button 8");
        JButton button9 = new JButton("Button 9");
        JButton button10 = new JButton("Button 10");

        // Add the buttons to the frame
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);
        frame.add(button8);
        frame.add(button9);
        frame.add(button10);

        // Set the size and make the frame visible
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}

