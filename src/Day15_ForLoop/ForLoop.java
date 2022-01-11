package Day15_ForLoop;

public class ForLoop {
    public static void main(String[] args) {
        String firstName = "MBAYE";
        String secondName = "diagNE";
        firstName = ("" + firstName.charAt(0)).toUpperCase() + (firstName.substring(1)).toLowerCase();
        secondName = (" " + secondName.charAt(0)).toUpperCase() + (secondName.substring(1)).toLowerCase();
        System.out.println(firstName + secondName);
    }
}
