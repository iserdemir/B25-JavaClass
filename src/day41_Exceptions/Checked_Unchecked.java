package day41_Exceptions;

public class Checked_Unchecked {
    public static void main(String[] args) {
        //unchecked exception
        int a =0;
        int b=0;
        System.out.println(a/b);
        System.out.println("Wooden Spoon");
        char [] characters = {'A', 'B', 'C'};

      //  System.out.println(characters[99]);

      //  Student s = null;
      //  System.out.println(s.getName());

        final String str = "WS";
      //  str=null;
       // System.out.println(str.toUpperCase());

        String str1 = ""; //object !=null
        System.out.println(str1.isEmpty());

        //checked exception
        System.out.println("Hello");

        //Thread.sleep(3000); //checked

        //FileInputStream file = new FileInputStream("path of the file");

        System.out.println("Java".charAt(1000)); //unchecked

    }
}
