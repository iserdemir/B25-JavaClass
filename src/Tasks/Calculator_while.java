package Tasks;

import java.util.Scanner;

public class Calculator_while {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your first number:");
        int num1 = scan.nextInt();
        System.out.println("Enter a math operator:");
        String math = scan.next();
        int sum = 0;
        if (!(math.equals("+") || math.equals("-") || math.equals("*") || math.equals("/"))) {
            while (!(math.equals("+") || math.equals("-") || math.equals("*") || math.equals("/"))) {
                System.err.println("Invalid Value!");
                System.out.println("Enter a math operator:");
                math = scan.next();

            }
            if (math.equals("+")) {
                System.out.println("Enter your second number");
                int num2 = scan.nextInt();
                sum = num1 + num2;
            } else if (math.equals("-")) {
                System.out.println("Enter your second number");
                int num2 = scan.nextInt();
                sum = num1 - num2;
            } else if (math.equals("*")) {
                System.out.println("Enter your second number");
                int num2 = scan.nextInt();
                sum = num1 * num2;
            } else {
                System.out.println("Enter your second number");
                int num2 = scan.nextInt();
                sum = num1 / num2;

            }
        } else if (math.equals("+")) {
            System.out.println("Enter your second number");
            int num2 = scan.nextInt();
            sum = num1 + num2;
        } else if (math.equals("-")) {
            System.out.println("Enter your second number");
            int num2 = scan.nextInt();
            sum = num1 - num2;
        } else if (math.equals("*")) {
            System.out.println("Enter your second number");
            int num2 = scan.nextInt();
            sum = num1 * num2;
        } else {
            System.out.println("Enter your second number");
            int num2 = scan.nextInt();
            sum = num1 / num2;
        }
        System.out.println(sum);

    }
}

