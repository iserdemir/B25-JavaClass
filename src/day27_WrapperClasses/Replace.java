package day27_WrapperClasses;

import java.util.Arrays;

public class Replace {
    public static int[] replace(int [] arr, int index, int element){
        if (index<0||index>arr.length-1){
            System.out.println("Invalid Index");
            System.exit(0);
        }else{
            arr[index] = element;
        }
        return arr;

    }

    public static void main(String[] args) {
        int[] arr = {1,9,0,8};
        arr = replace(arr,3,5);
        System.out.println(Arrays.toString(arr));
    }
}
