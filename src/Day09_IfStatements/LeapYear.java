package Day09_IfStatements;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a year");
        int year = input.nextInt();

        if (year % 4 == 0) {
            System.out.println("Year " + year + " is a leap year.");
        } else
            System.out.println("Year " + year + " isn't a leap year.");
    }
}
