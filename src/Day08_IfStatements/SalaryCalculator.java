package Day08_IfStatements;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your hourly rates");
        int hourlyRates = scan.nextInt();
        System.out.println("Please enter your weekly work hours");
        int weeklyHours = scan.nextInt();
        System.out.println("Please enter your state tax rate");
        double stateTaxRant = scan.nextDouble();
       double federalTaxRant = 26.2;

       int salaryBeforeTax = hourlyRates * weeklyHours * 52;
       double stateTax =salaryBeforeTax * stateTaxRant / 100;
       double federalTax = salaryBeforeTax * federalTaxRant / 100;
       double netWorth = salaryBeforeTax - stateTax - federalTax;
        System.out.format("%.2f", netWorth);
        System.out.println("Your net income is $" + netWorth);
    }
}
