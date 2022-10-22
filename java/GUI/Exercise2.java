package GUI;

import javax.swing.*;

public class Exercise2 {
    public static void main(String[] args) {
        int choices;
        choices = JOptionPane.showConfirmDialog(null,"Take your pick - yes, no or cancel");

        if(choices == JOptionPane.YES_OPTION)
            JOptionPane.showMessageDialog(null,"You chose yes","YES",
                    JOptionPane.PLAIN_MESSAGE);
        else if(choices == JOptionPane.NO_OPTION)
            JOptionPane.showMessageDialog(null,"You chose no","NO",
                    JOptionPane.PLAIN_MESSAGE);
        else if(choices == JOptionPane.CANCEL_OPTION)
            JOptionPane.showMessageDialog(null,"You chose cancel","CANCEL",
                    JOptionPane.PLAIN_MESSAGE);
        else
            JOptionPane.showMessageDialog(null,"You close the window without selecting",
                    "CLOSE",JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
    }
}
