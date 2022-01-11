package Day17_While_DoWhile;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your age:");
        int age = scan.nextInt();
        while(!(age >=1 && age<=120)){
            System.err.println("Invalid Value" + "\nRe-enter:");
            age = scan.nextInt();
        }
        System.out.println("Are you an US citizen?");
        String answer = scan.next();
        while(!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))){
            System.err.println("Invalid Value" + "\nRe-enter:");
            answer = scan.next();
        }if (age>=18 && answer.equalsIgnoreCase("yes")){
            System.out.println("You are eligible to vote");
        } else
            System.out.println("You are not eligible to vote");
    }
}
