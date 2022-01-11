package day20_Arrays;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {
        int [] numbers = {5,9,7,15,20,36};
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
