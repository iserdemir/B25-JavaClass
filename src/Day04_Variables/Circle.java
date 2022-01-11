package Day04_Variables;

public class Circle {
    public static void main(String[] args) {
        double radius = 5.5;
        double PI = 3.14;

        double diameter = radius * 2;
        double area = (radius * radius) * PI;
        double perimeter = 2 * radius * PI;

        System.out.println("Diameter: " + diameter);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);

    }
}
