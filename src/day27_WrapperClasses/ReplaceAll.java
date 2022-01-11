package day27_WrapperClasses;

import java.util.Arrays;

public class ReplaceAll {
    public static int [] replaceAll(int [] arr, int oldValue, int newValue){
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==oldValue){
                arr[i] = newValue;
            }

        }
        return arr;
    }

    public static void main(String[] args) {
        int [] arr = {5,6,7,8,9,2,5,6,5};
        arr = replaceAll(arr, 5,7);
        System.out.println(Arrays.toString(arr));

    }
}
