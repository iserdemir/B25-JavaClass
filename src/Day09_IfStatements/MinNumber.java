package Day09_IfStatements;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter two numbers:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        if (num1 > num2){
            System.out.println(num1 + " is the biggest number.");
        }
        else if (num2 > num1){
            System.out.println(num2 + " is the biggest number.");
        }
        else
            System.out.println(num1 + " and " + num2 + " are the same numbers.");
    }
}
