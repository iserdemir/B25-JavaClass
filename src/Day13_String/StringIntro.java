package Day13_String;

public class StringIntro {

        public static void main(String[] args) {
       String a = "Galata Saray";
       int totalChars = a.length();
       char lastChars = a.charAt(a.length()-1);
            System.out.println("lastChars = " + lastChars);
       String nw ="" + a.charAt(1) + a.charAt(7);
            System.out.println("nw = " + nw);

            String str = "    Batch 25   ";
            int n = str.indexOf("2");
            System.out.println("str = " + n);
            String str3 = "Java Programming Language";
            int n3 = str3.indexOf("gu");
            System.out.println("n3 = " + n3);
            int n4 = str3.lastIndexOf("m");
            System.out.println("n4 = " + n4);
            str = str.repeat(5);
            System.out.println("str = " + str);


            }
    }


