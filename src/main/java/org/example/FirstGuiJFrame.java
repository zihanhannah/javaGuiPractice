package org.example;

import javax.swing.*;
import java.awt.*;

// JFrame follows the CardLayout: only show the top card as default
public class FirstGuiJFrame extends JFrame {
    public FirstGuiJFrame() {
//        make the frame visible
        setVisible(true);
//        set the frame size
        setSize(400,400);

//        changing the default CardLayout to FlowLayout, GridLayout, Null.....
        setLayout(new GridLayout());
        JLabel label1 = new JLabel("Hello World");
        JLabel label2 = new JLabel("Welcome Navin");
//        adding letters in the frame
        add(label1);
        add(label2);
    }

    public static void main(String[] args) {
        FirstGuiJFrame obj = new FirstGuiJFrame();
    }
}
