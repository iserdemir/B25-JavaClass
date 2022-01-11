package Day12_Scanner;

import java.util.Scanner;

public class ShippingAdress {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Entre your full name");
        String name = s.nextLine();
        System.out.println("Enter your building number");
        String building = s.next();
        s.nextLine();
        System.out.println("Enter your street name");
        String street = s.nextLine();
        System.out.println("Enter your city name");
        String city = s.nextLine();
        System.out.println("Enter your state");
        String state = s.nextLine();
        System.out.println("Enter your zipcode");
        String zip = s.next();
        System.out.println("--------------------------");
        System.out.println("Shipping Address: " +"\n\t" + name + "\n\t" + building + " " + street + ", " + city + "\n\t" + state + ", " + zip);
    }
}
