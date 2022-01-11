package Day21_ForEachLoop;

public class MaxNumber {
    public static void main(String[] args) {
        int [] numbers = {8,99,52,46,65,54};
        int max = numbers[0];
        /*for (int each : numbers) {
            if (each > max){
                max = each;
            }
        }System.out.println(max);*/
        for (int number : numbers) {
            if (number>max){
                max = number;
            }

        }
        System.out.println(max);
    }
}
