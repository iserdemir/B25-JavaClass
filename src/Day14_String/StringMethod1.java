package Day14_String;

public class StringMethod1 {
    public static void main(String[] args) {
        String str1 = "   Batch 25  ";
        str1 =str1.trim();
        System.out.println("str1 = " + str1);

        String str2 = "Fernando Muslera";
        int n1 = str2.indexOf("o");
        System.out.println("n1 = " + n1);

        int n2 = str2.lastIndexOf("a");
        System.out.println("n2 = " + n2);

        int n3 = str2.lastIndexOf("e");
        System.out.println("n3 = " + n3);

        System.out.println("****************");
        String str = "Java Nova Cava Wawa orange";

        int firstA = str.indexOf("a");
        int lastA = str.lastIndexOf("a");
        int secondA = str.indexOf("a ");
        int thirdA = str.indexOf("a C");
        int fourthA = str.indexOf("Ca") + 1;
        int fifthA = str.indexOf("a W");
        int sixthA = str.lastIndexOf("a ");

        System.out.println("firstA = " + firstA);
        System.out.println("lastA = " + lastA);
        System.out.println("secondA = " + secondA);
        System.out.println("thirdA = " + thirdA);
        System.out.println("fourthA = " + fourthA);
        System.out.println("fifthA = " + fifthA);
        System.out.println("sixthA = " + sixthA);

    }
}
