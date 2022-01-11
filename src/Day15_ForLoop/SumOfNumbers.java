package Day15_ForLoop;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        int sa =0;
        for (int i =0; i <=10; i++){
            sum = sum + i;

        } System.out.println("sum = " + sum);
        for (int a = 1; a <=5; a++){
            System.out.println("enter a number:");
            int x = s.nextInt();
            sa += x;

        }
        System.out.println("sa = " + sa);
    }
}
