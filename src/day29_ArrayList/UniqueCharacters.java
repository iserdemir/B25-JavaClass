package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "aaabbccccdeeef";
        String [] arr = str.split("");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list);
        String unique = "";
        for (String s : list) {
           int frequency = Collections.frequency(list,s);
            if (frequency==1){
                unique = unique + s;
            }

        }
        System.out.println(unique);

    }
}
