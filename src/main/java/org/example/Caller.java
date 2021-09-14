package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Caller extends JFrame  implements ActionListener {
    int i;
    JProgressBar p;
    public Caller(){
        JButton b = new JButton("ADD Form");
        p = new JProgressBar(0,20);
        i = 0;
        final Timer t = new Timer(250,this);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t.start();
            }
        });
        add(b);
        add(p);

        setVisible(true);
        setSize(400,400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(i == 20){
           new AddGui();
//        once linked to the other form, the former form will be closed
           dispose();
       }
       i++;
       p.setValue(i);
    }

    public static void main(String[] args) {
        Caller c = new Caller();
    }
}
