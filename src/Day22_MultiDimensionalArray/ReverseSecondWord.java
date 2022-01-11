package Day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReverseSecondWord {
    public static void main(String[] args) {
        String sentence = "I love Java";
        String [] word = sentence.split(" ");
        String reverse = "";
        for (int i = word[1].length()-1; i>=0  ; i--) {
            reverse += word[1].charAt(i);

        }
        System.out.println(reverse);
        word[1] =reverse;
        System.out.println(Arrays.toString(word));
        for (String s : word) {
            System.out.print(s + " ");
        }
    }
}
