package Day21_ForEachLoop;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int [] number = {15,78,64,55,364,456};
        int [] reversed = new int[number.length];
       /* for (int i =0, j= number.length-1;j>=0;i++,j--) {
               reversed [i] = number[j];
               } System.out.println(Arrays.toString(reversed));*/
        for (int i = 0, j = number.length-1; i <= number.length-1 ; i++,j--) {
reversed[i] = number[j];
            }

        System.out.println(Arrays.toString(reversed));
        }
    }

