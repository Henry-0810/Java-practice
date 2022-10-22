package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Flow;

public class TextFieldJFrame {
    JTextField jTextField;

    public TextFieldJFrame() {
        JFrame frame = new JFrame("Adding a JTextFiled to a JFrame");

        FlowLayout flowLayout = new FlowLayout();
        frame.setLayout(flowLayout);
        frame.setSize(300, 400);
        frame.setLocation(350, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel jLabel1 = new JLabel("Please enter your address: ");
        frame.add(jLabel1);

        jTextField = new JTextField(15);
        jTextField.setForeground(Color.green);
        frame.add(jTextField);

        TextFieldEventHandler handler = new TextFieldEventHandler();
        jTextField.addActionListener(handler);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        TextFieldJFrame textFieldJFrame = new TextFieldJFrame();
    }

    private class TextFieldEventHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String name = jTextField.getText();
            JOptionPane.showMessageDialog(null, "Your address is " +
                    name, "", 1);
            System.exit(0);
        }
    }
}
