package GUI;

import javax.swing.*;
import java.awt.*;

public class FirstJFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        int choices;

        FlowLayout flowLayout = new FlowLayout(FlowLayout.LEFT);
        frame.setLayout(flowLayout);

        frame.setTitle("Exercise4.java");
        frame.setSize(400,400);
        frame.setLocation(250,250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel jLabel1 = new JLabel("Java Rules!");
        jLabel1.setForeground(Color.red);
        jLabel1.setToolTipText("A very Important fact!!!");
        frame.add(jLabel1);

        frame.setVisible(true);

        choices = JOptionPane.showConfirmDialog(null,"Are you sure you want to remove label");
        if(choices == JOptionPane.YES_OPTION) {
            frame.remove(jLabel1);
            frame.repaint();
        }
    }
}
