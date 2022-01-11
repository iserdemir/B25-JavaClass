package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {
    public static void main(String[] args) {
      /*  ArrayList<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Ali","David", "Ahmet", "Jayson", "Jaylen"));
        employees.retainAll(Arrays.asList("Ahmet", "David"));
        System.out.println(employees);*/
        dosum(10, 20);
        dosum(10.0, 20.0);
    }

    public static void dosum(double x, double y) {
        System.out.println("double" + (x + y));
    }

    public static void dosum(float x, float y) {
        System.out.println("float" + (x + y));
    }

    public static void dosum(int x, int y) {
        System.out.println("int" + (x + y));
    }
}
