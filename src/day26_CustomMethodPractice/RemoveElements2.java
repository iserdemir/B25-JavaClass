package day26_CustomMethodPractice;

import Day25_CustomMethod_Overloading.AddElementsToArray;

import java.util.Arrays;

public class RemoveElements2 {
    public static int[]removeElement(int[]arr, int index){
        int [] result = {};
        for (int i = 0; i < arr.length; i++) {
            if(i!=index){
              result =  AddElementsToArray.addInteger(result,arr[i] );
            }
        }
        return  result;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int index = 1;
       arr = removeElement(arr,index);
        System.out.println(Arrays.toString(arr));
    }
}
