package Day08_IfStatements;

import java.util.Scanner;

public class NumberOfDays {
    public static void main(String[] args) {
        Scanner g = new Scanner(System.in);
        System.out.println("Please enter a number between 1 to 12 as a month: ");
        int number = g.nextInt(); //1~12

        boolean has28Days = number == 2;
        boolean has30Days = number == 4 | number == 6 | number == 9 | number == 11;
        boolean has31Days = !has28Days && !has30Days;

        if (has28Days) {
            System.out.println("This month has 28 days!");
        }
        if (has30Days){
            System.out.println("This month has 30 days!");
        }
        if (has31Days){
            System.out.println("This month has 31 days!");
        }
    }
}
