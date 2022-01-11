package Day18_NestedLoop;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username:");
        String u = scan.nextLine();
        System.out.println("Enter your password");
        String p = scan.nextLine();
        String username = "Cydeo";
        String password = "WoodenSpoon";

        if ((u.equals(username) && p.equals(password))) {
            System.out.println("Logged In.");
        } else {
            for (int a = 1; a < 3; a++) {
                System.out.println("Your username or password isn't correct. Reenter:");
                System.out.println("Enter your username:");
                u = scan.nextLine();
                System.out.println("Enter your password");
                p = scan.nextLine();
                if ((u.equals(username) && p.equals(password))) {
                    System.out.println("Logged In.");
                    break;
                }
            }
            if (!(u.equals(username) && p.equals(password))) {
                System.out.println("Your account is locked.Please contact support team.");
            }


        }
    }
}
