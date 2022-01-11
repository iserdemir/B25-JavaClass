package Tasks;

import java.util.Arrays;

public class Descending_array {
    public static void main(String[] args) {
        int [] number = {1,5,9,3,4,6};
        Arrays.sort(number);
        System.out.println(Arrays.toString(number));
        int [] num = new int[number.length];
        for (int j = number.length-1, i=0; j >= 0 ; i++,j--) {

            num [i] = number[j];
            }
        System.out.println(Arrays.toString(num));
        }
    }

