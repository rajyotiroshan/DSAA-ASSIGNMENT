import java.util.Scanner;

/**
 *  written by @rajan 7/31/2018
 */
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        System.out.println(minimumCoins(m));
    }

    private static int minimumCoins(int amount) {
        int[] coins = {100,50,20,10,5,1};
        int[] coinNo = new int[coins.length];//store no of coins are used.
        int totalCoins = 0,n;
        for(int c=0; c < coins.length; c++) {
            if(amount == 0) return totalCoins;
            n=0;
            while(true){
                if(coins[c] <= amount) {
                    n++;
                    totalCoins++;
                    amount = amount - coins[c];
                }
                else break;
            }
            coinNo[c] = n;
        }
        for(int c=0; c<coinNo.length;c++){
            System.out.println(coins[c] + " = " + coinNo[c] );
        }
        return totalCoins;
    }
}
