package Tasks;

import java.util.Scanner;

public class TheHighestCalculator_for {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your word:");
        String word = scan.next();

        int max = -1;
        char hold= 'a';
        for (char a = 'a'; a<='z';a++){
            int num = 0;
            for (int j =0; j<word.length();j++){

                if (word.charAt(j) == a) {
                    num++;
                }

            } if (num >max){
                max = num;
                hold = a;
            }
            }
        System.out.println(hold + " " + max);

        }

    }

