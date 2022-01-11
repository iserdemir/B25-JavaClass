package Day12_Scanner;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter circle's radius");
        int radius = scan.nextInt();
        double perimeter = 2 * radius * 3.14 ;
        double area = (radius * radius * 3.14);
        int decimeter = 2* radius;
        System.out.println("decimeter = " + decimeter);
        System.out.println("perimeter = " + String.format("%.2f", perimeter));
        System.out.println("area = " + area);
        scan.close();
    }
}
