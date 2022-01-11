package Tasks;

import java.util.Scanner;

public class AgeGroups_Switch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scan.nextInt();
        switch ((age >= 1 && age <= 2) ? 1 :
                (age >= 3 && age <= 5) ? 3 :
                (age >= 6 && age <= 9) ? 6 :
                (age >= 10 && age <= 12) ? 10 :
                (age >= 13 && age <= 17) ? 13 :
                (age >= 18 && age <= 20) ? 18 :
                (age >= 21 && age <= 39) ? 21 :
                (age >= 40 && age <= 49) ? 40 :
                (age >= 50 && age <= 54) ? 50 :
                (age >= 55 && age <= 64) ? 55 :
                (age >= 65 && age <= 74) ? 65 :
                (age >= 75 && age <= 84) ? 75 : 85) {
            case 1:
                System.out.println("Infant");
                break;
            case 3:
                System.out.println("Toddler");
                break;
            case 6:
                System.out.println("Kid");
                break;
            case 10:
                System.out.println("Pre-teen");
                break;
            case 13:
                System.out.println("Teenager");
                break;
            case 18:
                System.out.println("Young Adult");
                break;
            case 21:
                System.out.println("Adult");
                break;
            case 40:
                System.out.println("Young Middle-Aged Adult");
                break;
            case 50:
                System.out.println("Middle-Aged Adult");
                break;
            case 55:
                System.out.println("Very Young Senior Citizen");
                break;
            case 65:
                System.out.println("Young Senior Citizen");
                break;
            case 75:
                System.out.println("Senior Citizen");
                break;
            case 85:
                System.out.println("Old Senior Citizen");
        }
    }
}
