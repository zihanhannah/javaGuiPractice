package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Caller extends JFrame  implements ActionListener {
    public Caller(){
        JButton b = new JButton("ADD Form");
        b.addActionListener(this);
        add(b);

        setVisible(true);
        setSize(400,400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new AddGui();
//        once linked to the other form, the former form will be closed
        dispose();
    }

    public static void main(String[] args) {
        Caller c = new Caller();
    }
}
