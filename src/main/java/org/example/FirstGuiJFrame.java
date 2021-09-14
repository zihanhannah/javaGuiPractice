package org.example;

import javax.swing.*;


public class FirstGuiJFrame extends JFrame {
    public FirstGuiJFrame() {
//        make the frame visible
        setVisible(true);
//        set the frame size
        setSize(400,400);


        JLabel label1 = new JLabel("Hello World");
//        adding letters in the frame
        add(label1);
    }

    public static void main(String[] args) {
        FirstGuiJFrame obj = new FirstGuiJFrame();
    }
}
