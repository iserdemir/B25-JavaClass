package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayAndArrayList {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6};
        int [] result = new int[array.length];
        int j = 0;
        for (int i = array.length-1; i >=0 ; i--) {
            result[j++] = array[i];
        }
        System.out.println(Arrays.toString(result));
        System.out.println("***************");
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7));
        ArrayList<Integer> r1 = new ArrayList<>();
        for (int i = list.size()-1; i >=0 ; i--) {
            r1.add(list.get(i));
        }
        System.out.println(r1);

    }
}
