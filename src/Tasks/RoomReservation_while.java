package Tasks;

import java.util.Scanner;

public class RoomReservation_while {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many nights would you like to stay?");
        int night = scan.nextInt();
        System.out.println("Which room would you like to stay? (King/Queen/Single)");
        String bed = scan.next();
        int price = 0;
        if (bed.equalsIgnoreCase("king")) {
            price = night * 120;
        } else if (bed.equalsIgnoreCase("queen")) {
            price = night * 100;
        } else if (bed.equalsIgnoreCase("single")) {
            price = night * 80;
        } else {
            System.out.println("Invalid Value!!");
        }
        System.out.println("Your price is $" + price);
        System.out.println("Would you like to reserve another room?");
        String answer = scan.next();
        if (answer.equalsIgnoreCase("yes"))
            while (answer.equalsIgnoreCase("yes")) {
                System.out.println("How many night would you like to stay?");
                night = scan.nextInt();
                System.out.println("Which room would you like to stay? (King/Queen/Single)");
                bed = scan.next();
                System.out.println("Would you like to reserve another room?");
                answer = scan.next();
                int price1 = 0;
                if (bed.equalsIgnoreCase("king")) {
                    price1 = night * 120;
                } else if (bed.equalsIgnoreCase("queen")) {
                    price1 = night * 100;
                } else if (bed.equalsIgnoreCase("single")) {
                    price1 = night * 80;
                } else {
                    System.out.println("Invalid Value!!");
                } price1 += price1;
                System.out.println("Your new room's price is $" + price1);
                System.out.println("Your total price is $" + (price1 + price));
                } else if (answer.equalsIgnoreCase("no")) {
            System.out.println("Your total price is $" + price);


        }
    }
}
