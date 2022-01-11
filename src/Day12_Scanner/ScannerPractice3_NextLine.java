package Day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your full name:");
        String name = scan.nextLine();
        System.out.println("Enter your age");
        int age = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter your school");
        String school = scan.nextLine();
        System.out.println("name = " + name);
    }
}
