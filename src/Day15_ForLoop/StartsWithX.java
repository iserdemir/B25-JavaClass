package Day15_ForLoop;

import java.util.Scanner;

public class StartsWithX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word:");
        String str = scanner.nextLine();
        if (str.charAt(0) == 'x'){
            str = str.replace('x', 'a');
            System.out.println("str = " + str);
        }
    }
}
