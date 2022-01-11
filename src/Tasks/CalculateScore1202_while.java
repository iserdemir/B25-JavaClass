package Tasks;

import java.util.Scanner;

public class CalculateScore1202_while {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your score:");
            int score = scan.nextInt();
            if (score < 0) {
                System.err.println("Invalid Value");
                System.exit(0);
            }
            switch ((score >= 90 && score <= 100) ? 1 :
                    (score >= 80 && score <= 89) ? 2 :
                     (score >= 70 && score <= 79) ? 3 :
                     (score >= 60 && score <= 69) ? 4 : 5) {
                case 1:
                    System.out.println("Score = A");
                    break;
                case 2:
                    System.out.println("Score = B");
                    break;
                case 3:
                    System.out.println("Score = C");
                    break;
                case 4:
                    System.out.println("Score = D");
                    break;
                case 5:
                    System.out.println("Score = F");
                    break;

            }
            System.out.println("Would you like to continue?");
            String answer = scan.next();
            while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
                System.err.println("Invalid Value!" + "\nRe-enter: ");
                answer = scan.next();
            }
            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Thank you for using Cydeo Calculator App!");
                System.exit(0);
            }
        }
    }
}
