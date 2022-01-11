package Tasks;

import java.util.Scanner;

public class uniqueChars_for {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int num = 0;
        char x = '0';

            for (int i = 0; i < str.length(); i++) {
                char a = str.charAt(i);
                if (str.lastIndexOf(a) == str.indexOf(a)) {
                     x = a;
                    System.out.print(x);
                }

            }

        }
    }

