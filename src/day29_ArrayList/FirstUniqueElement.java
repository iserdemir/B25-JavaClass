package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstUniqueElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,3,4,2,5,6,7,7,8,8));
        System.out.println(list);
        for (Integer integer : list) {
            int frequency =0;
            for (Integer integer1 : list) {
                if (integer1==integer){
                    frequency++;
                }

                }if (frequency==1){
                System.out.println(integer);
                break;
            }
        }
    }
}
