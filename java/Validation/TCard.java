import javax.swing.*;

public class TCard {
    public static void main(String[] args) {
        int counts = 3;
        String tNo;
        String output = "Number of valid t-numbers entered: " + counts + "\nList of valid t-numbers:\n\n";
        StringBuilder outputCont = new StringBuilder();
        while(counts < 6) {
            tNo = JOptionPane.showInputDialog("Please enter a t-number (return to exit)");
            if (tNo == null || tNo.isEmpty()) {
                JOptionPane.showMessageDialog(null, "You`entered no valid t-numbers!",
                        "Valid t-numbers", 1);
            } else if (tNo.length() == 9) {
                if (tNo.charAt(0) == 't' || tNo.charAt(0) == 'T') {
                    for (int i = 1; i < tNo.length(); i++) {
                        if (Character.isDigit(tNo.charAt(i))) {
                            outputCont.append(tNo).append("\n");
                            break;
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "You`entered no valid t-numbers!",
                        "Valid t-numbers", 1);
            }
            counts++;
        }
        JOptionPane.showMessageDialog(null, output + outputCont,
                "Valid t-numbers", 1);
    }
}
