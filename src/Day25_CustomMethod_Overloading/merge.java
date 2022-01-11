package Day25_CustomMethod_Overloading;

import utilities.ArraysUtility;

import java.util.Arrays;

public class merge {
    public static void main(String[] args) {
        int [] arr1 = {1,5,8,6};
        int [] arr2 = {5,7,6,8,9,3};
        int [] arr3 = {};
        //int a =0;
        for (int i : arr1) {
         arr3 = ArraysUtility.addElement(arr3,i);
        }
        for (int i : arr2) {
            arr3 =ArraysUtility.addElement(arr3,i);
        }
        arr3 = ArraysUtility.reverse(arr3);
        System.out.println(Arrays.toString(arr3));
    }
}
