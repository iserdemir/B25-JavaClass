package Tasks;

import java.util.Arrays;

public class anaram1212 {
    public static void main(String[] args) {
        isAnagram("cba", "bac");
    }
    public static String isAnagram(String str, String word) {
        char[] a = str.toCharArray();
        char[] b = str.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if (Arrays.equals(a,b)) {
            System.out.println("This is anagram");
        } else{
            System.out.println("Not anagram");
    }
        return str;
    }
}
