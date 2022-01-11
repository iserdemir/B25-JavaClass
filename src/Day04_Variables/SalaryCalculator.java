package Day04_Variables;

public class SalaryCalculator {
    public static void main(String[] args) {
        int hourlyRate = 17;
        int weeklyHours = 45;
        int numberOfWeeks = 52;

        System.out.println("Salary: " + hourlyRate * weeklyHours * numberOfWeeks);
    }
}
