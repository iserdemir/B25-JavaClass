package Tasks;

public class Reverse1212 {
    public static void main(String[] args) {
   reverse("level");
    }
public static String reverse(String str){
    String result ="";
    for (int i = str.length()-1; i >=0 ; i--) {
        result += str.charAt(i);

    }if (result.equalsIgnoreCase(str)) {
        System.out.println("This is palindrome");
    }
    return str;
}
}
