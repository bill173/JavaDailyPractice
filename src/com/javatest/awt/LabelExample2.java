package com.javatest.awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * In the following example, we are creating the objects of TextField, Label and Button classes and adding them to the Frame.
 * Using the actionPerformed() method an event is generated over the button.
 * When we add the website in the text field and click on the button, we get the IP address of website.
 */

//creating class which implements ActionListener interface and inherits Frame class
public class LabelExample2 extends Frame implements ActionListener {

    // creating objects of TextField, Label and Button class
    TextField tf;
    Label l;
    Button b;

    // constructor to instantiate the above objects
    LabelExample2() {
        tf = new TextField();
        tf.setBounds(50, 50, 150, 20);

        l = new Label();
        l.setBounds(50, 100, 250, 20);

        b = new Button("Find IP");
        b.setBounds(50,150,60,30);
        b.addActionListener(this);

        add(b);
        add(tf);
        add(l);

        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }

    // defining actionPerformed method to generate an event
    public void actionPerformed(ActionEvent e) {
        try {
            String host = tf.getText();
            String ip = java.net.InetAddress.getByName(host).getHostAddress();
            l.setText("IP of "+host+" is: "+ip);
        }
        catch (Exception ex) {
            System.out.println(ex);
        }
    }

    // main method
    public static void main(String[] args) {
        new LabelExample2();
    }
}
