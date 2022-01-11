package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        boolean b = num.addAll(Arrays.asList(1, 2, 3, 4, 5));
        num.set(num.size()-1,0 );
        System.out.println(num);
        System.out.println("***************");
        ArrayList<Integer> num1 = new ArrayList<>();
        for (int i = num.size()-1; i >=0 ; i--) {
            num1.add(num.get(i));
        }
       System.out.println(num1);
        System.out.println("***********");
        for (int i = num.size()-1; i >=0 ; i--) {
            num1.add(num.get(i)*2);
        }
        System.out.println(num1);
        int a = num1.get(0);
        for (Integer integer : num1) {
            if (integer>a){
                a=integer;
            }
        }
        System.out.println(a);
    }

}
