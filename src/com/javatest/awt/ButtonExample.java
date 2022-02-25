package com.javatest.awt;
// importing Java AWT class

import java.awt.*;

/**
 * Java AWT (Abstract Window Toolkit) is an API to develop Graphical User Interface (GUI) or window-based applications in Java.
 */
// extending Frame class to our class AWTExample1
public class ButtonExample extends Frame {

    // initializing using constructor
    ButtonExample() {
        // creating a button
        Button b = new Button("Click Me!!");
        // setting button position on screen
        b.setBounds(30, 100, 80, 30);
        // adding button into frame
        add(b);
        // frame size 300 width and 300 height
        setSize(300, 300);
        // setting the title of Frame
        setTitle("This is our basic AWT example");
        // no layout manager
        setLayout(null);
        // now frame will be visible, by default it is not visible
        setVisible(true);
    }

    // main method
    public static void main(String args[]) {
// creating instance of Frame class
        ButtonExample f = new ButtonExample();

    }

}