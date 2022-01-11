package day26_CustomMethodPractice;

import java.util.Arrays;

public class RemoveElements1 {
    public static int[] removeElement(int[] array, int index){
        int [] result = new int[array.length-1];
        int i =0;
        for (int each : array) {
            if (each!=array[index]){
                result[i++] += each;
            }
        }
        System.out.println(Arrays.toString(result));
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,3};
        removeElement(arr1, 3);
    }
}
