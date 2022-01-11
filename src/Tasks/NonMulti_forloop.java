package Tasks;

import java.util.Scanner;

public class NonMulti_forloop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two positive number:");
        int x = s.nextInt();
        int y = s.nextInt();
        int a =0;
        if (x > 0 && y > 0) {
            for (int i = 0; i < y; i++) {
                a += x;


            }
        }else {
                System.out.println("Invalid Value");
            }

        System.out.println("sum = " +  a);
    }
}

