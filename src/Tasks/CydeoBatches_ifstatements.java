package Tasks;


import java.util.Scanner;

public class CydeoBatches_ifstatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your batch type");
        String batchType = scan.nextLine();

        if (batchType.matches("US morning")) {
            System.out.println("Class times are 10-5 EST. M, T, Th, F.");
        } else if (batchType.matches("US evening")) {
            System.out.println("Class times are 7-10 EST. M, T, W, Th, S, S");
        } else if (batchType.matches("EU")) {
            System.out.println("Class times are  10-5 EST. M, T, W, Th, F.");
        } else
            System.out.println("Invalid Batch");
    }
}

