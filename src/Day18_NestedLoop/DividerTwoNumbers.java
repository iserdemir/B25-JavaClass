package Day18_NestedLoop;

import java.util.Scanner;

public class DividerTwoNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    int b =s.nextInt();
    int count = 0;
    if (a>=b){
        while(a>=b){
            a = a-b;
            count++;
        }
        System.out.println("Divider = " + count + " Remainder = " + a);
    }else{while(b>=a){
        b = b-a;
        count++;
    }
        System.out.println("Divider = " + count + " Remainder = " + b);

    }


    }
}
