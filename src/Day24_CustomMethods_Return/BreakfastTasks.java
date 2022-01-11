package Day24_CustomMethods_Return;

public class BreakfastTasks {
    public static void main(String[] args) {
        initials("Ismail Erdemir");
        emailDomain("is.erdemir@gmail.com");
        nameOfMonths(13);
    }
    public static void initials(String name){
        name = name.charAt(0) + "." + name.charAt(name.indexOf(" ")+1);
        System.out.println(name);
    }
    public static void emailDomain(String email){
        email = email.substring(email.indexOf("@")+1, email.lastIndexOf("."));
        System.out.println(email);
        String [] emails = {"info@cydeo.com", "ingo@galatasaray.com", "info@minallc.co"};
        for (String s : emails) {
            s = s.substring(s.indexOf("@")+1, s.lastIndexOf("."));
            System.out.println(s);
        }
    }
    public static void nameOfMonths(int number) {
        if (number >= 1 && number <= 12){
            switch (number) {
                case 1:
                    System.out.println("January");
                    break;
                case 2:
                    System.out.println("February");
                    break;
                case 3:
                    System.out.println("March");
                    break;
                case 4:
                    System.out.println("April");
                    break;
                case 5:
                    System.out.println("May");
                    break;
                case 6:
                    System.out.println("June");
                    break;
                case 7:
                    System.out.println("July");
                    break;
                case 8:
                    System.out.println("August");
                    break;
                case 9:
                    System.out.println("September");
                    break;
                case 10:
                    System.out.println("October");
                    break;
                case 11:
                    System.out.println("November");
                    break;
                case 12:
                    System.out.println("December");
                    break;

            }
    }else{
            System.out.println("Invalid Value!");

        }
    }

}
