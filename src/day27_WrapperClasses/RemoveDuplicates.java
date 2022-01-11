package day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {
    public static int [] removeDuplicates(int [] arr){
        int []result = {};

        for (int i : arr) {

            if (!ArraysUtility.contains(result,i)){
                result = ArraysUtility.addElement(result,i);
            }




        }
        return result;
    }

    public static void main(String[] args) {
        int []arr={1,2,2,2,5,5,4,6,9};
        arr = removeDuplicates(arr);
        System.out.println(Arrays.toString(arr));
        int [] arr1 = {1,1,1,1,2,2,2,3,4,5,5,5};
        arr1 = Arrays.stream(arr1).distinct().toArray();
        System.out.println(Arrays.toString(arr1));
    }
}
