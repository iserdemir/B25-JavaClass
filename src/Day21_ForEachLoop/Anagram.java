package Day21_ForEachLoop;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str = "listen";
        String str1 = "silent";
        char[] ch = str.toCharArray();
        char[] ch1 = str1.toCharArray();
        System.out.println(Arrays.toString(ch));
        Arrays.sort(ch);
        Arrays.sort(ch1);
        boolean r = Arrays.equals(ch, ch1);
        System.out.println("Anagram: " + r);
    }
}
