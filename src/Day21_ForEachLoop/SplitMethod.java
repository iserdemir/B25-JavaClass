package Day21_ForEachLoop;

import java.util.Arrays;

public class SplitMethod {
    public static void main(String[] args) {


        String str = "The best team is Galatasaray";
        String[] str1 = str.split(" ");
        System.out.println(Arrays.toString(str1));
        String str2 = "iserdemir@gmail.com";
        String[]str3 = str2.split("@");
        System.out.println(Arrays.toString(str3));
        String sentence = "Today is Monday.This week will be great.He's gonna be champion.";
        String [] sen = sentence.split("\\.");
        System.out.println(Arrays.toString(sen));


    }
}
