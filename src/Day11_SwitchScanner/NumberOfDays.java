package Day11_SwitchScanner;

public class NumberOfDays {
    public static void main(String[] args) {
        int year = 2000;
        int month = 2;
        String result = "";
        if (month >= 1 && month <= 12) {
            switch (month) {
                case 2:
                    result = (year % 4 == 0) ? "28 Days" : "29 Days";
                    System.out.println(result);
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    result = "30 Days";
                    System.out.println(result);
                    break;
                default:
                    result = " 31 Days";
                    System.out.println(result);
            }
        } else System.out.println("Invalid Value");
    }
}
