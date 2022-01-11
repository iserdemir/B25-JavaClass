package day28_ArrayList;

public class StrongPassword {
    public static void main(String[] args) {

        isStrongPassword("I.erdemir25.");

    }
    public static boolean isStrongPassword(String password){
        boolean r1 = password.length() >= 8 && !password.contains(" ");
        boolean r2 = false;//has upper case
        boolean r3 = false;//has lower case
        boolean r4 = false;//has a special character
        boolean r5 = false;//has a digit
        char[] ch = password.toCharArray();
        for (char c : ch) {
            if (Character.isUpperCase(c)) {
                r2 = true;
            }
            else if (Character.isLowerCase(c)) {
                r3 = true;
            }
            if (Character.isDigit(c)){
                r5 = true;
            } else{r4 = true;
            }

        }boolean isStrong = r1&r2&r3&r4&r5;
        System.out.println("This is strong password = " + isStrong);
        return  isStrong;
    }
}