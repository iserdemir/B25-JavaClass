package Day08_IfStatements;

public class EligibleToVote {
    public static void main(String[] args) {
        String name = "Marcao";
        int age = 25;
        String citizen = "Brasil";

         boolean isEligible = age >=21 && citizen == "USA";

        if (isEligible){
            System.out.println("Eligible");
        }
        if (!isEligible){
            System.out.println("Not Eligible");
        }
    }
}
