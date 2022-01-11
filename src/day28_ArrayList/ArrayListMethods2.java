package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods2 {
    public static void main(String[] args) {

        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(4);
        list.add(7);
        list.add(5);
        list.add(451);
        Integer num = 5;
        list.remove(num);
        System.out.println(list);
        System.out.println("*****************");
        //list.clear();//remove all elements
        System.out.println(list);
        //indexOf(Data): return the firs matching element's index number, returns int
        //lastIndexOf():
        ArrayList<Character> ch = new ArrayList<>();
        ch.add('G');
        ch.add('A');
        ch.add('L');
        ch.add('A');  //


        int a = ch.indexOf('A');//1
        int b = ch.lastIndexOf('A');//3
        System.out.println("a:" + a + " b:" + b);
        System.out.println("**************");
        boolean rr = ch.contains('G');
        System.out.println(rr);
        System.out.println("***********");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(100);
        list2.add(100);

        System.out.println(list1 == list2);
        System.out.println(list1.equals(list2));

        System.out.println("-----------------------------------------");
        list1.clear();
        boolean r4 =  list1.isEmpty(); // true

        System.out.println("r4 = " + r4);

        System.out.println("----------------------------------");

        ArrayList<Integer> numbers = new ArrayList<>();
        //Bulk Operation: CollectionType
        numbers.addAll(Arrays.asList(1,2,3,4,4,6,7 ));

        System.out.println(numbers);

    }
}
