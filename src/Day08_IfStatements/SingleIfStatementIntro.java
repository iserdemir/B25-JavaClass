package Day08_IfStatements;

import java.util.Scanner;

public class SingleIfStatementIntro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter any number");
        int number = scan.nextInt();
        boolean evenNumber = number%2 == 0;
        boolean oddNumber = !evenNumber;

        if (evenNumber){
            System.out.println(number + " is even number");
        }
        if (oddNumber){
            System.out.println(number + " is odd number");
        }



    }
}
