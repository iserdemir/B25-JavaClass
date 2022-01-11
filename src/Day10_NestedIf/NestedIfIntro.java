package Day10_NestedIf;

import java.util.Scanner;

public class NestedIfIntro {

    public static void main(String... args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Please enter your age \n------------");
        int age = a.nextInt();
        System.out.println("Do you have an ID?? (Yes or No) \n--------------");
        String hasId = a.next();
         if (hasId.matches("Yes|yes|YES|YEs|yEs|YeS|yeS|y|Y")){
             if (age >= 21){
                 System.out.println("Eligible to buy alcohol");
             }
             else{
                 System.out.println("Not eligible to buy alcohol");
             }
         }
         else {
             System.out.println("You should have an ID to buy alcohol");
         }

    }
}
