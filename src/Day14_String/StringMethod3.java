package Day14_String;

public class StringMethod3 {
    public static void main(String[] args) {
        String mail = "is.erdemir@gmail.com";
        int beg = mail.indexOf("@")+1;
        int fin = mail.lastIndexOf(".");
        String domain = mail.substring(beg, fin);
        System.out.println(domain);
        System.out.println("*************");
        String str = "Cydeo School";
        str = str.substring(0, 5);
        System.out.println("str = " + str);



    }
}
