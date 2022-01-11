package Tasks;

import java.util.Scanner;

public class SalaryCalculator1202_while {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("How much do you make an hour?");
            double hourlyRate = scan.nextDouble();
            if (hourlyRate <= 0){
                System.err.println("Invalid Value!");
                System.exit(0);
            } System.out.println("How many hours do you work per week?");
            double weeklyHours = scan.nextDouble();
            if (weeklyHours<=0){
                System.err.println("Invalid Value!");
                System.exit(0);
            }
            System.out.println("Enter your state tax");
            double stateTax = scan.nextDouble();
            if (stateTax<=0 || stateTax>=144){
                System.err.println("Invalid Value!");
                System.exit(0);
            }
            double grossSalary = hourlyRate*weeklyHours*52;
            double federalTax = grossSalary*26.0/100;
            double staTax = stateTax*grossSalary;
            double totalTax = federalTax+staTax;
            double netIncome = grossSalary-totalTax;
            System.out.println("grossSalary = " + grossSalary);
            System.out.println("federalTax = " + federalTax);
            System.out.println("stateTax = " + staTax);
            System.out.println("totalTax = " + totalTax);
            System.out.println("netIncome = " + netIncome);
            System.out.println("Would you like to continue?");
            String answer = scan.next();
            while (!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no"))){
                System.err.println("Invalid Value!!" + "\nRe-enter");
                answer =scan.next();
            } if (answer.equalsIgnoreCase("no")){
                System.out.println("Thank you for using Cydeo Calculator APP!");
                System.exit(0);
            }


        }
    }
}
