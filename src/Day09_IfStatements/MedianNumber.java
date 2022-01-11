package Day09_IfStatements;

import java.util.Scanner;

public class MedianNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter three different numbers:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if (num1 > num3 && num3 > num2) {
            System.out.println(num3 + " is the median number.");
        } else if (num1 > num2 && num3 > num1) {
            System.out.println(num1 + " is the median number.");
        } else
            System.out.println(num2 + " is the median number.");
    }
}
