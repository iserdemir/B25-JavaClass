package utilities;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("Enter Item1 and its price:");
            String item = scan.next();
            double price = scan.nextDouble();
            System.out.println("Add one more item?");
            String countinue = scan.next();
            int count = 1;
            double totalPrice = 0;
            String shoppingListReport = "";
            if(countinue.equals("no")){
                break;
            }



        }


    }
}

