/**
 * crated by @rajan 7/25/2018
 */
public class Main {
    public static void main(String[] args) {
        int[] number_list = {5,7,3,8,4,9,7,6,7};
        System.out.println(largestnumber(number_list));

    }

    private static String largestnumber(int[] number_list) {
        String result = "";
        int max_i;
        for(int i=0; i< number_list.length; i++){
            max_i = 0;
            for(int j = 0 ;j < number_list.length ; j++){
                if(number_list[j] > number_list[max_i]) {
                    max_i = j;
                }
            }
            result += number_list[max_i];
            number_list[max_i] = -1;
        }
        return result;
    }

}
