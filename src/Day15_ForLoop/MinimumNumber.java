package Day15_ForLoop;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int min = 255;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Please enter a number:");
            int a = s.nextInt();
            if (min > a) {
                min = a;

            }
        }
        System.out.println(min);
    }
}
