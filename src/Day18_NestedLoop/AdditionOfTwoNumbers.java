package Day18_NestedLoop;

import java.util.Scanner;

public class AdditionOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       while(true) {
           System.out.println("Enter your first number:");
           int num1 = scan.nextInt();
           System.out.println("Enter your second number:");
           int num2 = scan.nextInt();
           System.out.println("Addition = " + (num1 + num2));
           System.out.println("Would you like to continue?");
           String answer = scan.next();
           //if (answer.equalsIgnoreCase("yes")){
           while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
               System.out.println("Invalid input.Please re-enter:");
               answer = scan.next();
           }
           if (answer.equalsIgnoreCase("no")) {
               System.out.println("Thank you!");
               break;
           }

       }
    }
}
