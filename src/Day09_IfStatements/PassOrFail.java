package Day09_IfStatements;

import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your score:");
        int score = scan.nextInt();
        if (score >= 60){
            System.out.println("Passed !!");
        }
        else
            System.out.println("Failed !!");
    }
}
