package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPractice3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many would you like to enter?");
        int input = scan.nextInt();
        if (input <=0){
            System.err.println("Invalid Value");
            System.exit(0);
        }else{
            int [] numbers = new int[input];
            for (int i = 0; i < numbers.length ; i++) {
                System.out.println("Enter a number");
                 numbers[i] = scan.nextInt();

            }
            System.out.println(Arrays.toString(numbers));

        }
    }
}
