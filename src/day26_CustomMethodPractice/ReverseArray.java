package day26_CustomMethodPractice;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int []arr1 ={1,9,0,5};
        int [] arr2 = {2,5,8,2};
        int [] result = {};
        result = reverse(arr1);
        System.out.println(Arrays.toString(result));
        result = reverse(arr2);
        System.out.println(Arrays.toString(result));

    }
    public static int [] reverse(int [] arr1){
        int [] result = new int[arr1.length];
        for (int i = arr1.length-1,j=0; j<arr1.length; i--,j++) {
            result[j]=arr1[i];

        }
        return result;
    }
}
