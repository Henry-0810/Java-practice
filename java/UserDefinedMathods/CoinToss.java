package UserDefinedMathods;

import java.util.Scanner;

public class CoinToss {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Please enter the number of coin tosses you want: ");
        int times = s1.nextInt();
        int tails = 0;
        int heads = 0;
        float times2 = times;
        for(int i = 1; i <= times; i++){
            if(coinToss() == 1){
                tails++;
                System.out.println("Coin toss " + i + ": tails");
            }
            else{
                heads++;
                System.out.println("Coin toss " + i + ": heads");
            }
        }

        System.out.println("\n\n===========Overall Results===========\n");
        System.out.println("Percentage of heads: " + String.format("%.0f",(heads/times2)*100));
        System.out.println("\nPercentage of tails: " + String.format("%.0f",(tails/times2)*100));
    }

    private static int coinToss() {
        return (int)(2*Math.random());
    }
}
