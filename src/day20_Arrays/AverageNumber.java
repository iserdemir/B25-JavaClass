package day20_Arrays;

public class AverageNumber {
    public static void main(String[] args) {
        double [] num = {1,5,9,4,2,6,4,15};
        double a = 0;
        for (double v : num) {
            a +=v;
        }
        System.out.println("Average = "+ a/num.length);
    }
}
