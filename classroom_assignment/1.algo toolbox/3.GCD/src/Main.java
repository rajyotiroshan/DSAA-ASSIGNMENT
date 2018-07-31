/**
 * created by @rajan 7/21/2018
 */
public class Main {
    /*
        direct algo from prob statement/definition
     */
    private static int findGCDDirectAlgo(int a, int b){
        int best=0, d;
        System.out.println(a +" "+ b);
        if(b<a){
            int temp = b;
            b=a;
            a=temp;
        }
        System.out.println(a +" "+ b);
        if(a == 0) return b;
        if(b == 0) return a;
        if( b%a == 0) return a;
        for(d=1; d<=a/2;d++){
            if( a%d == 0 && b%d==0){//both a and b is divided by d.
                best = d;//now current largest no is d.which divides both a and b.
            }
        }

        return best;
    }
    /*
        An efficient one using euclidian's theorem on gcd.
     */


    public static void main(String[] args) {
        System.out.println(findGCDDirectAlgo(657848342,4468792));
        System.out.println(findGCDEfficiently(12,14));
    }

    private static int findGCDEfficiently(int a, int b) {


    }


}
