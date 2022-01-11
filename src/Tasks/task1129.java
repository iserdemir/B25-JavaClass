package Tasks;

import java.util.Scanner;

public class task1129 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int x = 0;

        if (a > b) {
            for (int y = a; y >= b; y -= b) {
                x++;
            }
            System.out.println("x= " + x);
        } else {
            for (int y = b; y >= a; y -= a) {
                x++;


            }
            System.out.println("x= " + x);
        }
    }
}



