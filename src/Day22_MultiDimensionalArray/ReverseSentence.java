package Day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReverseSentence {
    public static void main(String[] args) {
        String sentence = "Today is a good day to learn Java";
        String [] str =sentence.split(" ");
        System.out.println(Arrays.toString(str));
        String reserved = "";
        for (int i = str.length-1; i >=0 ; i--) {
            reserved += str[i] + " ";
        }
        System.out.println(reserved);
    }
}
