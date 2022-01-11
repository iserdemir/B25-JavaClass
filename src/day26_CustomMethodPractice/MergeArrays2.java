package day26_CustomMethodPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class MergeArrays2 {
    public static void main(String[] args) {
        int []arr1 ={1,9,0,5};
        int [] arr2 = {2,5,8,2};
        int [] result = {};
        result = merge2(arr1,arr2);
        System.out.println(Arrays.toString(result));
    }
    public static int []merge2(int [] arr1, int [] arr2){
        int [] result = {};
        int count =0;
        for (int i : arr1) {
          result =  ArraysUtility.addElement(result,i);
        }
        for (int i : arr2) {
           result = ArraysUtility.addElement(result,i);
        }
        return result;
    }
}
