package Day08_IfStatements;

public class EvenlyDivisible {
    public static void main(String[] args) {
        int number = 452;
         boolean divisibleBy2 = number % 2 == 0;
         boolean divisibleBy3 = number % 3 ==0;
         boolean divisibleBy5 = number % 5 == 0;
        System.out.println("dvisibleby2 = " + divisibleBy2);
        System.out.println("divisibleBy3 = " + divisibleBy3);
        System.out.println("divisibleBy5 = " + divisibleBy5);

    }
}
