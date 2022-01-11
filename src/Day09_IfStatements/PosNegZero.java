package Day09_IfStatements;

import java.util.Scanner;

public class PosNegZero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scan.nextInt();

        if (number > 0) {
            System.out.println(number + " is a positive number");
        } else if (number < 0) {
            System.out.println(number + " is a negative number");
        } else
            System.out.println(number + " is zero");
    }
}
