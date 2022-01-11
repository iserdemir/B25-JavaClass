package Day21_ForEachLoop;

public class AverageNumber {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5,6,7,8};
        double sum = 0;
        for (int each : numbers) {
            sum +=each;
        } System.out.println(sum/ numbers.length);
    }
}
