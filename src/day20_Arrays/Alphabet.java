package day20_Arrays;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {
        char[] alphabet = new char[26];
        char ch = 'A';
        for (int i = 0; i < alphabet.length ; i++) {
            alphabet[i] =  ch;
            ch++;

        }
        System.out.println(Arrays.toString(alphabet));
    }
}
