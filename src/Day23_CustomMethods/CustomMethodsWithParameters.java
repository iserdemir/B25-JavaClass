package Day23_CustomMethods;

import java.util.Scanner;

public class CustomMethodsWithParameters {
    public static void oddOrEven(int num) {
        if (num % 2 == 0) {
            System.out.println("It's even");
        } else {
            System.out.println("It's odd");
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        oddOrEven(scanner.nextInt());
        System.out.println("Enter your birth year:");
        ageOfPerson(scanner.nextInt());
        System.out.println("Enter two numbers:");
        printNumbers(scanner.nextInt(), scanner.nextInt() );

    }

    public static void ageOfPerson(int birthYear) {
        int age = 2022 - birthYear;
        System.out.println("Your age is " + age);
    }

    public static void printNumbers(int x, int y) {
        if (x < y) {
            for (int i = x+1; x < y; x++) {
                System.out.print(x + " ");
            }
            }else{
            for (int i = y+1; y < x; y++) {
                System.out.print(y + " ");
            }

        }
    }
}

