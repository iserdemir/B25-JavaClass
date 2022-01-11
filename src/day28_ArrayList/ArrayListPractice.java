package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<Integer> num1 = new ArrayList<>();
        num1.add(1);
        num1.add(2);
        num1.add(3);
        num1.add(4);
        num1.add(5);
        num1.add(6);
        for (int i = 0; i < num1.size(); i++) {
            num1.set(i,num1.get(i)*2);
        }
        System.out.println(num1);
        System.out.println("*************");

        ArrayList<String> employees = new ArrayList<>();
        employees.add("Tatum");
        employees.add("Brown");
        employees.add("Williams");
        employees.add("Horford");
        employees.add("Smart");
        employees.add("Schroder");
        employees.remove(3);
        boolean r1 = employees.remove("Schroder");
        System.out.println("r1 = " + r1);
        System.out.println(employees);
    }
}
/*
{1,2,3,4,5,6}

{2,4,6,8,10,12}
 */