package Day08_IfStatements;

public class GradeReport {
    public static void main(String[] args) {
        int score = 47;

        boolean a = score >= 90 && score <= 100;
        boolean b = score >= 80 && score <= 89;
        boolean c = score >= 70 && score <= 79;
        boolean d = score >= 60 && score <= 69;
        boolean e = score >= 50 && score <= 59;
        boolean f = score <= 49;

        if (a){
            System.out.println("Excellent");
        }
        if (b){
            System.out.println("Great");
        }
        if (c){
            System.out.println("Good");
        }
        if (d){
            System.out.println("Not Bad");
        }
        if (e){
            System.out.println("Bad");
        }
        if (f){
            System.out.println("Again!!");
        }
    }
}
