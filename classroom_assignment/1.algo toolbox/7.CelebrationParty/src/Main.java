import java.util.Scanner;

/**
 * created by @rajan 7/26/2018
 */
public class Main {
    private static int minChildrenGroup(float[] age,int ageDiff){
        int group = 0;
        int leftmostchild= 0;
        int currentchild;
        while(leftmostchild < age.length-1) {
            currentchild = leftmostchild +1;
            while(currentchild < age.length && age[currentchild] - age[leftmostchild] <= ageDiff) {
                currentchild++;
            }
            leftmostchild = currentchild;
            group++;

        }

        return group;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ageDiff = scanner.nextInt();
        float[] age = {1, 1.2f, 3.2f, 4, 4.8f, 5.6f, 7, 9.4f, 10, 11.1f};
        System.out.println(minChildrenGroup(age,ageDiff));

    }
}
