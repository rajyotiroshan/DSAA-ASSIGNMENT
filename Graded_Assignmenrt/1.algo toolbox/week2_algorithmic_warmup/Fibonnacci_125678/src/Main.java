import java.util.Scanner;

/**
 * created by @rajan 7/23/2018
 */
public class Main {
    private static long nthFib(int n) {
        if(n<=1) return n;
        else {
            return nthFib(n-1) + nthFib(n-2);
        }
    }
    private static long nthFibFast(int n){
        long fibSeq[] = new long[n+1];
        fibSeq[0] = 0;
        fibSeq[1] = 1;
        for(int i=2;i <= n; i++) {
            fibSeq[i] = fibSeq[i-1] + fibSeq[i-2];
        }
        return fibSeq[n];//return nth fib no.
    }
    /*
        last digit of nthfibnlastdigit
     */
    private static int nthfibLastDigit(int n){
        int fibSeq[] = new int[n+1];
        int sum = 0;
        fibSeq[0] = 0;
        fibSeq[1]  =1;
        for(int i=2; i<=n; i++){
         fibSeq[i] = (fibSeq[i-1]%10 + fibSeq[i-2]%10)%10;
        }
        //last digit of sum of n fib no.
        for(int i=0;i<=n;i++){
            sum = (sum%10)+ fibSeq[i];
        }
        System.out.println("last digit of sum of :"+ n + "fib nos:: " + sum);
        return fibSeq[n];
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(nthFibFast(n));
        System.out.println(nthfibLastDigit(n));
        //System.out.println(nthFib(n));
        System.out.println("rajan");
    }

}
