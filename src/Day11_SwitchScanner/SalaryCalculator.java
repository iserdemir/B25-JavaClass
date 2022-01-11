package Day11_SwitchScanner;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your salary: ");
        double salary = scan.nextDouble();
        double taxRate = 0;
        System.out.println("Are you married? (Yes/No)");
        String isMarried = scan.next();

        if (salary >= 130000) {
            taxRate = 0.35;
        } else if (salary >= 100000) {
            taxRate = 0.30;
        } else if (salary >= 80000) {
            taxRate = 0.25;
        } else taxRate = 0.2;

        if (isMarried.equals("Yes")){
            taxRate -= 0.05;
        }
        System.out.println("Tax Rate = " + taxRate);

    }
}
