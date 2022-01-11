package Day13_String;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Entre your full name");
        String name = s.nextLine();
        System.out.println("Enter your age");
        int age = s.nextInt();
        s.nextLine();
        System.out.println("Enter your gender");
        String gender = s.nextLine();
        System.out.println("Enter your phone number");
        String phoneNumber = s.nextLine();
        System.out.println("Enter your address");
        String state = s.nextLine();
        System.out.println("Enter your zipcode");
        String zip = s.next();
        System.out.println("--------------------------");
    }
}
