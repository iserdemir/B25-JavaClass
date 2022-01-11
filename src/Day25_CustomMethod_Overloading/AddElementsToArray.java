package Day25_CustomMethod_Overloading;

import java.util.Arrays;

public class AddElementsToArray {
    public static int[] addInteger(int[] array, int element) {
        int[] result = new int[array.length + 1];
        int i = 0;
        for (int i1 : array) {
            result[i++] = i1;
        }
        result[i] = element;
        return result;
    }
    public static char[] addChar(char[] array, char element) {
        char[] result = new char[array.length + 1];
        int i = 0;
        for (char i1 : array) {
            result[i++] = i1;
        }
        result[i] = element;
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        arr = addInteger(arr, 5);
        System.out.println(Arrays.toString(arr));
        int []arr1 ={1,2};
        arr1 = addInteger(arr1,7);
        System.out.println(Arrays.toString(arr1));
        char [] arr2 = {'a','b', 'c'};
        arr2 =addChar(arr2, 'i');
        System.out.println(Arrays.toString(arr2));

    }

}

