package Day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {
        int[] num = {1, 9, 0, 5};
        System.out.println(num);//hashcode, implicit
        System.out.println(Arrays.toString(num));
        String str = "Java";
        System.out.println(str);
        System.out.println("*****************");
//toString(): converts the array object (single dimensional) ro sting, return string
//sort(): sorts the array in ascending order
        int[] numbers = {95, 78, 71, 92, 71, 17};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println("Min Num: " + numbers[0]);
        System.out.println("Max Num: " + numbers[numbers.length - 1]);
        System.out.println("*****************");
        String[] names = {"Muslera", "Kerem", "Marcao", "Cicaldau", "Morutsan"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        for (int i = names.length - 1; i >= 0; i--) {
            String ch = names[i];
            System.out.print(ch + " ");
        }
            System.out.println("\n********");
            String[] words = {"Anna", "ANNA"};
            Arrays.sort(words);
            System.out.println(Arrays.toString(words));
            System.out.println("**************");
            int[] arr1 = {1, 2, 3};
            int[] arr2 = {1, 3, 2};
            boolean r1 = Arrays.equals(arr1, arr2);
            System.out.println(r1);
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            boolean r2 = Arrays.equals(arr1, arr2);
            System.out.println(r2);
            System.out.println("************");
            // anagram --> earth-heart, silent-listen
            char[]ch1 = {'a', 'b', 'c'};
            char[]ch2 = {'b', 'a','c'};
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            boolean r3 = Arrays.equals(ch1, ch2);
            System.out.println("anagram = " + r3);
        System.out.println("************");



    }
}