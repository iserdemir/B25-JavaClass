package Day17_While_DoWhile;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first number:");
        int num1 = scan.nextInt();
        System.out.println("Enter your second number:");
        int num2 = scan.nextInt();
        System.out.println("Enter a math operator:");
        char op = scan.next().charAt(0);

        while(!(op == '+' || op == '-'|| op =='/' || op =='*')){
            System.err.println("Invalid Operator!" + "\nRe-enter:");
            op = scan.next().charAt(0);
        } if (op == '+'){
            System.out.println(num1 + num2);
        } else if (op == '-'){
            int sum = num1 - num2;
            if (sum<0){
                sum = -sum;
                System.out.println(sum);
            } else {
                System.out.println(sum);
            }
        } else if (op == '/'){
            System.out.println(num1/num2);

        } else{
            System.out.println(num1*num2);
        }

    }
}
