package org.example;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyDemo implements KeyListener {
    JFrame frame;
    JLabel label;
    int x = 0, y= 0;

    public KeyDemo(){

        label = new JLabel("some images");
        label.setBounds(x,y,300,300);


        frame = new JFrame();
        frame.setSize(840,840);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.addKeyListener(this);
        frame.add(label);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if(key == KeyEvent.VK_UP){
            y = y -10;
            label.setLocation(x,y);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("You stopped pressing a key");
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    public static void main(String[] args) {
        KeyDemo demo = new KeyDemo();
    }
}
