package day26_CustomMethodPractice;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int []arr1 ={1,9,0,5};
        int [] arr2 = {2,5,8,2};
        int [] result = {};
        result = merge(arr1,arr2);
        System.out.println(Arrays.toString(result));
    }
    public static int [] merge(int[]arr1,int[] arr2){
        int [] result = new int[arr1.length+ arr2.length];
        int count = 0;
        for (int each : arr1) {
            result[count++] = each;
        }
        for (int each : arr2) {
            result[count++] = each;
        }
        return result;
    }
}
