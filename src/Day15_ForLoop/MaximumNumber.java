package Day15_ForLoop;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = 0;
        for (int i =1; i<=5; i++){
            System.out.println("Enter your number:");
        int number = scan.nextInt();
        if (number < max){
            max = number;
        }

       }
        System.out.println("max = " + max);
    }
}
