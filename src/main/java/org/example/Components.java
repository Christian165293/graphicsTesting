package org.example;

//for drawing an ellipse the below import needs to take place

import java.awt.geom.Ellipse2D;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;

//write separate class to set up components meant to be added to the frame
public class Components extends JComponent {
    public void paintComponent(Graphics g) {
// Recover Graphics2D
        Graphics2D g2 = (Graphics2D) g;

// Draw the head
        Ellipse2D.Double head = new Ellipse2D.Double(5, 10, 100, 150);
        g2.draw(head);

// Draw the eyes
        g2.setColor(Color.GREEN);
        Rectangle eye = new Rectangle(25, 70, 15, 15);
        g2.fill(eye);
        eye.translate(50, 0);
        g2.fill(eye);

// Draw the mouth
        Line2D.Double mouth = new Line2D.Double(30, 110, 80, 110);
        g2.setColor(Color.RED);
        g2.draw(mouth);

// Draw the greeting
        g2.setColor(Color.BLUE);
        g2.drawString("Hello, World!", 5, 175);

    }
}
