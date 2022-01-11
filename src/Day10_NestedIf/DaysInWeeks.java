package Day10_NestedIf;

import java.util.Scanner;

public class DaysInWeeks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your day:");
        int day = scan.nextInt();
        if (day == 1) {
            System.out.println("It's Monday");
        } else if (day == 2) {
            System.out.println("It's Tuesday");
        } else if (day == 3) {
            System.out.println("It's Wednesday");
        } else if (day == 4) {
            System.out.println("It's Thursday");
        } else if (day == 5) {
            System.out.println("It's Friday");
        } else if ((day == 6)) {
            System.out.println("It's Saturday");
        } else if (day == 7) {
            System.out.println("It's Sunday");
        } else
            System.out.println("Invalid Number!");

    }
}
