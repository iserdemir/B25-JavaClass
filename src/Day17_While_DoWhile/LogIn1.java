package Day17_While_DoWhile;

import java.util.Scanner;

public class LogIn1 {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        String user = "Cydeo";
        String password = "Cydeo123";
        System.out.println("Enter username");
        String user1 = scan.next();
        System.out.println("Enter password");
        String pass = scan.next();
        int attemps = 3;
        if (user.equals(user1)&&password.equals(pass)){
            System.out.println("Logged In!");
        }else {
            while (!(user.equals(user1) && password.equals(pass)) && attemps > 0) {
                System.out.println("Incorrect password or username. Re-enter");
                System.out.println("Username");
                user1 = scan.next();
                System.out.println("Password");
                pass = scan.next();
                attemps--;

            }
            if (user.equals(user1) && password.equals(pass)) {
                System.out.println("Logged In!");
            } else {
                System.out.println("Your account is locked.");
            }
        }
    }
}
