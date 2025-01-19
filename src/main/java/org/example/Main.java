package org.example;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //these steps below must be taken whenever setting up a frame for graphics
        JFrame frame = new JFrame();
        frame.setSize(300, 400);
        frame.setTitle("an empty frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //this is what actually points to the location of a drawn rectangle and adds it to frame
        Components testingComponents = new Components();

        frame.add(testingComponents);

        //a frame must be set to visible if you want to see it
        frame.setVisible(true);
    }
}

