package Tasks;

import java.util.Scanner;

public class Divisible15_whileFor {
    public static void main(String[] args) {

        System.out.println("Enter a number");
        int num = new Scanner(System.in).nextInt();
        String div15 = "Divisible By 15: ", div5 = "Divisible By  5: ", div3 = "Divisible By  3: ";

        while (num < 0) {
            System.err.println("Invalid Number!");
            System.out.println("Enter a number: ");
            num = new Scanner(System.in).nextInt();
        }

        for (int i = 1; i <= num; i++) {
            if (i % 15 == 0) {
                div15 += i + " ";
            } else if (i % 5 == 0) {
                div5 += i + " ";
            } else if (i % 3 == 0) {
                div3 += i + " ";
            }


        }
        System.out.println(div15);
        System.out.println(div5);
        System.out.println(div3);

    }
}



