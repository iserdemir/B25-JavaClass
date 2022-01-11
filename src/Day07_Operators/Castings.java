package Day07_Operators;

public class Castings {
    public static void main(String[] args) {
        float averageScore = 19.05f;

        byte num1 = (byte)averageScore;
        short num2 = num1;
        int num3 = num2;
        float num4 = averageScore;
        double num5 = averageScore;
        long num6 = (long)averageScore;

        System.out.println("averageScore = " + averageScore);
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("num5 = " + num5);
        System.out.println("num6 = " + num6);
    }
}
