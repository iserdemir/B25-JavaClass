package Day18_NestedLoop;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(true){
            int num1 = s.nextInt();
            if (num1%2==0){
                System.out.println("This is even");
            } else{
                System.out.println("This is odd");
            }
            System.out.println("Would you like to continue?");
            String answer = s.next().toLowerCase();
            while(!(answer.equals("yes")||answer.equals("no"))){
                System.out.println("Invalid Value! \nRe-enter:");
                answer = s.next();
            } if (answer.equals("no")){
                System.out.println("Thank you!");
                break;
            }
        }
    }
}
