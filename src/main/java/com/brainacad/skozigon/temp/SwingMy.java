package com.brainacad.skozigon.temp;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by skozigon on 27.07.2016.
 */
public class SwingMy {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("MyProgram");
        jFrame.setSize(300, 200);
        jFrame.setLocation(100, 200);
        jFrame.setVisible(true);

        JButton jButton = new JButton("KNIPKA");
        jButton.setSize(120, 50);
        jButton.setLocation(90, 50);
        jFrame.add(jButton);

        JLabel jLabel = new JLabel();
        jLabel.setSize(120,30);
        jLabel.setLocation(10, 50);
        jFrame.add(jLabel);
        jFrame.setVisible(true);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jLabel.setText("KNIPKA Click!");

            }
        });





    }
}
