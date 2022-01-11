package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeCalculator {
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll((Arrays.asList(100,90,75,85,65,85,45,73,73,35,47)));
        ArrayList<Integer>gradeOfA = new ArrayList<>(scores);
        gradeOfA.removeIf(p-> !( p>=90 && p<=100));
        System.out.println("A: " + gradeOfA );

    }
}
