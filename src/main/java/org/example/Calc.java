package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Callable;

public class Calc extends JFrame implements ActionListener{
    JTextField t1, t2;
    JButton b1 , b2;
    JLabel label;

    public Calc(){
        t1 = new JTextField(15);
        t2 = new JTextField(15);
        b1 = new JButton("Add");
        b2 = new JButton("Sub");
        label = new JLabel("Result");

        add(t1);
        add(t2);
        add(b1);
        add(b2);
        add(label);

        b1.addActionListener(this);
        b2.addActionListener(this);

        setVisible(true);
        setSize(400,400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int num1 =Integer.parseInt(t1.getText());
        int num2=Integer.parseInt(t2.getText());
        int value;
//      using .getSource() to get the eventListener's info
        if(e.getSource() == b1){
            value = num1 + num2;
        } else {
            value = num1 - num2;
        }
        label.setText(" "+ value);
    }

    public static void main(String[] args) {
        Calc cal = new Calc();
    }
}
