package Day10_NestedIf;

import java.util.Scanner;

public class GradeReport2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your score:");
        int score = scan.nextInt();
        String result = " ";
        if (score >= 0 && score <= 100){
            result = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C": (score >= 60) ? "D" : "Failed" ;
            System.out.println(result);
        } else
            System.out.println("Invalid Score");
    }
}
