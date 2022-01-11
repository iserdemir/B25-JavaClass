package Day24_CustomMethods_Return;

import java.util.Arrays;

public class ReturnMethodPractice2 {
    public static void main(String[] args) {

        int [] arr1 = {20,5,2,14,100};
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(sortArray(arr1)));


    }
    
    
    public static int [] sortArray( int [] arr1) {
        int num = arr1[0];
        int z =0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length-1 ; j++) {
                if (arr1[j] > arr1[j + 1]) {
                    int a = arr1[j + 1];
                    arr1[j + 1] = arr1[j];
                    arr1[j] = a;
                }
            }
        }

return arr1;
    }
}
