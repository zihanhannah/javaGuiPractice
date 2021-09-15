package org.example.graphic;

import javax.swing.*;
import java.awt.*;
import java.util.jar.JarFile;

public class Graphic2D extends JFrame {

    GraphicsDemo graphicsDemo = new GraphicsDemo();

    public Graphic2D() {
        add(graphicsDemo);

        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Graphic2D graphic2D = new Graphic2D();
    }

}
