package UserDefinedMathods;

import java.util.Scanner;

public class PeriodCalc {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Please enter the length of the pendulum: ");
        double input = s1.nextDouble();

        periodCalculator(input);
    }

    private static void periodCalculator(double num) {
        final double pi = 3.142;
        final double g = 9.8;

        double T = 2*pi*(Math.sqrt((num/g)));
        System.out.printf("The period of the pendulum is %.3f seconds", T);
    }
}
