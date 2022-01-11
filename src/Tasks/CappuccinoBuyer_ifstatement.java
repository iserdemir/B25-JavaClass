package Tasks;

import java.util.Scanner;

public class CappuccinoBuyer_ifstatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your coffee size: (Tall/ Grande/Venti)");
        String size = scan.next();

        if (size.matches("Tall|Grande|Venti|tall|grande|venti")) {
            switch (size) {
                case "Tall":
                case "tall":
                    System.out.println("Price is $3.69. (90 calories)");
                    break;
                case "Grande":
                case "grande":
                    System.out.println("Price is $3.99. (120 calories)");
                    break;
                case "Venti":
                case "venti":
                    System.out.println("Price is $4.29. (150 calories)");
                    break;
            }

        } else
            System.out.println("Invalid Size");
    }
}
