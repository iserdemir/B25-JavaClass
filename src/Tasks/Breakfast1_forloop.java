package Tasks;

import java.util.Scanner;

public class Breakfast1_forloop {
    public static void main(String[] args) {
      /*  String str = "AABBCCBC";
        str = "" + str.charAt(0) + str.substring(6);
        System.out.println("str = " + str);
        System.out.println("*********************"); */
        String str = " AABBCCBC";
        String str1 = "";
        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);
            if(str1.indexOf(a)<0){
                str1 += a;
            }
        }
        System.out.println(str1);
        System.out.println("************");
        String word = "AABCCD";
        String uniqueCharacters = "";
        for (int i = 0; i < word.length()-1; i++) {
            if(word.indexOf(word.charAt(i))==word.lastIndexOf(word.charAt(i))){
                uniqueCharacters+=word.charAt(i);
            }
        }
        System.out.println(uniqueCharacters);

    }
}
