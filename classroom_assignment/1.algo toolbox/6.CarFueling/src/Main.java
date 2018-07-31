import java.util.Scanner;

/**
 * created by @rajan 7/26/2018
 */
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int max_dist = scn.nextInt();
        int[] gas_station = {0,350,750,950,1050,1370,1400};
        int refiling = noOfRefiling(gas_station, max_dist);
        System.out.println(refiling);
    }

    private static int noOfRefiling(int[] station, int max_dist) {
        int current_station = 0; //start point.
        int refil= 0, dist_covered = 0;
        ////repeat until destination is arrived.
        int next_station;//start from 1st position.
        while(current_station <= station.length-1) {
            //find the next farthest station to refill tank.
            //start from next station.
            next_station = current_station + 1;
            dist_covered = 0;
            while( (next_station <= station.length-1)&&
                    (station[next_station] - station[current_station]) <= max_dist ) {
                dist_covered = station[next_station] -  station[current_station];
                next_station ++;
            }
            //next station is far from reach.
            if( dist_covered == 0) {
                if (next_station <= station.length - 1) return -1;
                else return refil;
            }

            current_station = next_station - 1;
            refil++;
        }

        return refil;
    }
}
