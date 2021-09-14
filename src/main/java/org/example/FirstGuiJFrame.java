package org.example;

import javax.swing.*;
import java.awt.*;

// JFrame follows the CardLayout: only show the top card as default
public class FirstGuiJFrame extends JFrame {
    public FirstGuiJFrame() {
        JLabel label1 = new JLabel("Hello World");
        JLabel label2 = new JLabel("Welcome Navin");
//        adding letters in the frame
        add(label1);
        add(label2);


//        todo : the must have
//        make the frame visible
        setVisible(true);
//        set the frame size
        setSize(400,400);
//        changing the default CardLayout to FlowLayout, GridLayout, Null.....
        setLayout(new FlowLayout());
//        make the exit button on the Frame work( terminate the program): two ways
//        setDefaultCloseOperation(3);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        FirstGuiJFrame obj = new FirstGuiJFrame();
    }
}
