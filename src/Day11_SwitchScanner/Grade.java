package Day11_SwitchScanner;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your grade");
        String ch = scan.next();

        switch (ch) {
            case "A":
            case "B":
            case "C":
            case "D":
                System.out.println("Passed!");
                break;
            case "F":
                System.out.println("Failed!");
                break;
            default:
                System.out.println("Invalid!");
        }
    }
}