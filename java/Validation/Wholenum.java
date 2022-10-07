import javax.swing.*;
import java.util.Objects;

public class Wholenum {
    public static void main(String[] args) {
        String input;
        do{
            input = JOptionPane.showInputDialog("Please enter as many whole numbers");

        }
        while(!Objects.equals(input, "x"));
    }
}
