package Day10_NestedIf;

public class TernariesIntro {
    public static void main(String[] args) {
        int n = 100;
        if (n % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        System.out.println("************");
        String result1 = (n % 2 == 0) ? "Even" : "Odd";
        System.out.println(result1);
        System.out.println("**************");
        int age = 85;
        String result2 = (age >= 21 && age <= 80) ? "Eliginle" : "Not Eligible";
        System.out.println(result2);
    }
}
