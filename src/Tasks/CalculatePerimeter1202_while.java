package Tasks;

import java.util.Scanner;

public class CalculatePerimeter1202_while {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the radius of the circle:");
            int radius = scan.nextInt();
            if (radius <= 0) {
                System.err.println("Invalid Entry for the radius of the circle");
                System.exit(0);
            }
            int diameter = radius * 2;
            double area = radius * radius * 3.14;
            double perimeter = 2 * 3.14 * radius;
            System.out.println("diameter = " + diameter);
            System.out.println("area = " + area);
            System.out.println("perimeter = " + perimeter);
            System.out.println("Would you like to calculate another circle?");
            String answer = scan.next();
            while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
                System.err.println("Invalid Value" + "\nReenter: ");
                answer = scan.next();
            }
            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Thank you for using Cydeo Circle Calculator APP");
                System.exit(0);
            }
        }
    }

}



