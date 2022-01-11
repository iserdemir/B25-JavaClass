
package Tasks;

        import java.util.Scanner;

public class CalculateRectangle1202_while {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("Please enter a side");
            int side = scan.nextInt();
            System.out.println("please enter another side");
            int side1 = scan.nextInt();
            if (side <=0 || side1<=0){
                System.err.println("Invalid Value!!");
                System.exit(0);
            } int area = side*side1;
            int perimeter = 2*(side+side1);
            System.out.println("area = " + area);
            System.out.println("perimeter = " + perimeter);
            System.out.println("Would you like to calculate another square?");
            String answer = scan.next();
            while(!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))){
                System.err.println("Invalid Value" + "\nRe-enter:");
                answer = scan.next();
            }
            if (answer.equalsIgnoreCase("no")){
                System.out.println("Thank you for using Cydeo Calculator App");
                System.exit(0);
            }
        }
    }
}