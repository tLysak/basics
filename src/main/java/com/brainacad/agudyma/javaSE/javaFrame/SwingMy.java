package com.brainacad.agudyma.javaSE.javaFrame;

import javax.swing.*;
import java.awt.event.*;

/**
 * Created by User on 7/27/2016.
 */
public class SwingMy {
    public static void main(String[] args) {
        JFrame jfrm = new JFrame("My Program");
        jfrm.setSize(300,200);
        jfrm.setLocation(100,200);
        jfrm.setVisible(true);
        JButton jbtn = new JButton("КНОПКА");
        jbtn.setSize(120,50);
        JButton jbtn1 =new JButton("BUTTON2");
        jbtn1.setSize(100,50);
        jbtn1.setLocation(100,100);
        jfrm.add(jbtn);
        jfrm.add(jbtn1);

        jbtn.setLocation(40,25);
        jbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button click");
                System.out.println(e);
            }
        });
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
        jbtn1.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

    }
}
