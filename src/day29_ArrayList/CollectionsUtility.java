package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,9,8,5,3,1,7,6,4));
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        Collections.swap(list, 1,2);
        System.out.println(list);
        System.out.println("************");
        int max = Collections.max(list);
        int min = Collections.min(list);
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
