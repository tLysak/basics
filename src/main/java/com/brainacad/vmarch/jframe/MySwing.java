package com.brainacad.vmarch.jframe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MySwing {


    public static void main(String[] args) {

        JFrame jfrm = new JFrame("My Program");
        jfrm.setSize(340, 250);
        jfrm.setLocation(100, 200);
        jfrm.setVisible(true);

        JButton jbtn = new JButton("Click me!");
        jbtn.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                System.out.print(e.getKeyChar());
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });

        jbtn.setSize(100, 35);
        jbtn.setLocation(12, 30);
        jbtn.setForeground(Color.GREEN
        );
        jbtn.setBackground(Color.YELLOW);
        jfrm.add(jbtn);

    }
}

