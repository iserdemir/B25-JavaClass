package Day08_IfStatements;

public class LogicalOperators {
    public static void main(String[] args) {
        int creditScore = 724;
        int income = 100000;
        int rental = 2500;
        String name = "Jennifer";

        boolean a = creditScore > 730 || income > 200000 || rental < 1500;

        System.out.println(name + "is eligible for loan = " + a );

        System.out.println("***********************************");

        int score = 13;
        boolean passed = score >=60;
        boolean failed = !passed;
        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);
    }
}
