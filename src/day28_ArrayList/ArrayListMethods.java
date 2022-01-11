package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add( "G" );//0
        students.add("A");//1
        students.add("L");//3
        students.add("A"); //4
        students.add(2,"S");//2
        students.add(5,"M" );
         System.out.println(students);
        System.out.println(students.size());
        int lastIndex = students.size()-1;
        System.out.println(lastIndex);
        System.out.println("***************");
        String three = students.get(3);//get(index)
        System.out.println(three);
        System.out.println("*************");
        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(9);
        num.add(0);
        num.add(5);
        num.set(2,9);//replace
        System.out.println(num);
    }
}
