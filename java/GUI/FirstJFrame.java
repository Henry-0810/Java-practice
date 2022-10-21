package GUI;

import javax.swing.*;

public class FirstJFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setTitle("Exercise4.java");
        frame.setSize(250,250);
        frame.setLocation(150,150);
        frame.setVisible(true);
        JOptionPane.showMessageDialog(null,"Text obtained from the JFrame title bar is\n\n"+
                "\"Exercise 4\"","Title Bar Text",1);
        System.exit(0);
    }
}
