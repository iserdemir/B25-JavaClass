package Tasks;

import java.util.Scanner;

public class PositiveNegative_forloop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = 0;
        int p = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter a number");
            int a = s.nextInt();
            if (a < 0) {
                n++;
            } else if (a > 0) {
                p++;

            }

        }
        System.out.println(n + " negative" + " and " + p + " positive");


    }
}
