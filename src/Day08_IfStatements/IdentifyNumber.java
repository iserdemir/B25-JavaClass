package Day08_IfStatements;

public class IdentifyNumber {
    public static void main(String[] args) {
        int number = 83;

        boolean isPositive = number > 0;
        boolean isZero = number == 0;
        boolean isNegativi = number < 0;

        System.out.println(number + " is positive number;" + isPositive);
        System.out.println(number + " is zero;" + isZero);
        System.out.println(number + " is negative number;" + isNegativi);
    }
}
