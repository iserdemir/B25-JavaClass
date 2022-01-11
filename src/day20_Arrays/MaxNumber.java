package day20_Arrays;

public class MaxNumber {
    public static void main(String[] args) {
        int [] num = {5,8,4,6,44,885,6,1,6,499,22,64};
        int a = num[0];
        for (int i : num) {
            if (i > a){
                a =i;
            }

        }
        System.out.println("Max = " + a);
    }
}
