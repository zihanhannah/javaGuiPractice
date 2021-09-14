package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddGui extends JFrame implements ActionListener {
    JTextField t1,t2;
    JButton b;
    JLabel label;

    public AddGui()  {
//        create a TextField with 20 space
       t1 = new JTextField(20);
       t2 = new JTextField(20);

       b = new JButton("OK");
       label = new JLabel("Result:");

        add(t1);
        add(t2);
        add(b);
        add(label);

//        add EventListener, ActionListener is an Interface
//        this should be the interface of ActionListener
        b.addActionListener(this);

////    todo without implementing the ActionListener , we can do this way
//        b.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                int num1 =Integer.parseInt(t1.getText());
//                int num2=Integer.parseInt(t2.getText());
//                int value = num1 + num2;
//                label.setText(" "+ value);
//            }
//        });

        setVisible(true);
        setSize(400,400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

//    everytime when we click the button, it will call the actionPerformed method
    @Override
    public void actionPerformed(ActionEvent e) {
        int num1 =Integer.parseInt(t1.getText());
        int num2=Integer.parseInt(t2.getText());

        int value = num1 + num2;
        label.setText(" "+ value);
    }




    public static void main(String[] args) {
        AddGui addition1 = new AddGui();
    }
}
