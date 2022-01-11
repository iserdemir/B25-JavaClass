package Day12_Scanner;

import java.util.Scanner;

public class GradeLevel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your child's age:");
        byte number = scan.nextByte();
        switch ((number >= 1 && number <= 5) ? 1 :
                (number >= 6 && number <= 8) ? 2 :
                        (number >= 9 && number <= 12) ? 3 :
                                (number >= 13 && number <= 16) ? 4 :
                                        (number >= 17 && number <= 18) ? 5 : 6) {
            case 1:
                System.out.println("Elementary School");
                break;
            case 2:
                System.out.println("Middle School");
                break;
            case 3:
                System.out.println("High School");
                break;
            case 4:
                System.out.println("College");
                break;
            case 5:
                System.out.println("Grade School");
                break;
            default:
                System.out.println("Invalid Number!");
        }
        System.out.println("\n********* - SOLUTION 2 - ***********\n");

        if (number >= 1 && number <= 12) {
            switch (number) {
                case 1:  case 2:  case 3:  case 4: case 5:
                    System.out.println("Elementary School");
                    break;
                case 6:  case 7:  case 8:
                    System.out.println("Middle School");
                    break;
                case 9:  case 10:  case 11:  case 12:
                    System.out.println("High School");
                    break;
            }
        }

        if (number > 12 ) {
            switch (number) {
                case 13:  case 14:  case 15:  case 16:
                    System.out.println("College");
                    break;
                case 17:  case 18:
                    System.out.println("Grade School");
                    break;
                default:
                    System.out.println("Invalid Number!");

            }
        }
    }
}

