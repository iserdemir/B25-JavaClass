package Day15_ForLoop;

public class Contains {
    public static void main(String[] args) {
        String str = "      ";
        boolean a= str.isEmpty();
        System.out.println("a = " + a);
        boolean b = str.isBlank();
        System.out.println("b = " + b);
        String str1 = "Cydeo    ";
        boolean c = str1.isBlank();
        System.out.println("c = " + c);
        System.out.println("************");
        String s1 = "Morutan";
        String s2 = "morutan";
        boolean d = s1.equals(s2);
        boolean e = s1.equalsIgnoreCase(s2);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("**************");
        String s3 = "Java is cool";
        String s4 = "Java";
        boolean f = s3.contains(s4);
        boolean g = s4.contains(s3);
        System.out.println("f = " + f);
        System.out.println("g = " + g);
        System.out.println("***************");
        String s5 = "Fatih Terim";
        boolean h = s5.startsWith("Fat");
        boolean i = s5.endsWith("rim");
        System.out.println("h = " + h);
        System.out.println("i = " + i);

    }
}
