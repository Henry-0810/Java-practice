package Validation;

import javax.swing.*;

public class TCard {
    public static void main(String[] args) {
        String tNo = JOptionPane.showInputDialog("Please enter a t-number (return to exit)");
        if(tNo.isEmpty()){
            JOptionPane.showMessageDialog(null,"You`entered no valid t-numbers!",
                    "Valid t-numbers",1);
        }
        else if(tNo.length() == 9){
            if( tNo.charAt(0)=='t' || tNo.charAt(0)=='T'){
                for(int i = 1; i<tNo.length(); i++){
                    if(Character.isDigit(tNo.charAt(i))){
                        JOptionPane.showMessageDialog(null,"Valid t-Number",
                                "Valid t-numbers",1);
                    }
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"You`entered no valid t-numbers!",
                    "Valid t-numbers",1);
        }

    }
}
