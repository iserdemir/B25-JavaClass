package Tasks;

import java.util.Arrays;

public class ThreeMerge_Array {
    public static void main(String[] args) {
        int [] arr1 = {30,56,45};
        int [] arr2 = {5,7,4,2,6,3};
        int [] arr3 = {71,89,8,66,23,11,20,19};
        int [] num = new int[arr1.length+arr2.length+ arr3.length];
        int num1 = 0;
        for (int i : arr1) {
            num[num1++] = i;
        }for (int i1 : arr2) {
            num[num1++] = i1;
        }       for (int i2 : arr3) {
            num[num1++] = i2;
                }
Arrays.sort(num);
        System.out.println(Arrays.toString(num));
    }
}
