package org.example.graphic;

import javax.swing.*;
import java.awt.*;

public class GraphicsDemo extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.setBackground(Color.BLACK);

        Graphics2D g2D = (Graphics2D) g;

//        g2D.setColor(Color.MAGENTA);
//        g2D.setStroke(new BasicStroke(20));
//        g2D.drawLine(0,0,400,400);

//        int[] xPoints = {50,100,150,200,250,300,350};
//        int[] yPoints = {350,250,275,200, 275,150,100};
//        int nPoints = xPoints.length;
//
//        g2D.setColor(Color.GREEN);
//        g2D.drawPolyline(xPoints,yPoints,nPoints);
//
//        g2D.setFont(new Font("Comic Sans", Font.ITALIC,25));
//        g2D.setColor(Color.GREEN);
//        g2D.drawString("STONKS",100,100);

//        g2D.setColor(Color.YELLOW);
//        g2D.fillOval(30,30,300,300);

//        g2D.setPaint(new Color(150,120,144));
//        g2D.drawArc(50,50,300,300,0,90);

        GradientPaint paint = new GradientPaint(0,0,Color.ORANGE,420,10,Color.BLUE);
        g2D.setPaint(paint);
        g2D.fillArc(50,50,300,300,175,270);

    }
}
