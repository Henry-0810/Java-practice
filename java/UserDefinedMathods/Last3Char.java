package UserDefinedMathods;

import java.util.Scanner;

public class Last3Char {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Please enter a piece of text: ");
        String txt = s1.next();

        last3Characters(txt);
    }

    private static void last3Characters(String txt) {
        if(txt.length() < 3)
            System.out.print("\"\"");
        else
            System.out.println(txt.substring(txt.length()-3));
    }
}
