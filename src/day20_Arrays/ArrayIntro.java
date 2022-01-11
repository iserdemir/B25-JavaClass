package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayIntro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] myGroup = new String[5];
        myGroup[0] = "Hagi";
        myGroup[1] = "Bulent";
        myGroup [2] = "Hakan";
        myGroup [3] = "Umit";
        myGroup[4] = "Okan";
        System.out.println(Arrays.toString(myGroup));
        System.out.println("*************");
        String [] days = {"Monday","Tuesday", "Wednesday", "Thursday","Friday", "Saturday","Sunday" };
        System.out.println(Arrays.toString(days));
        for (int i = 0; i <days.length ; i++) {
            System.out.println(days[i]);

        }

        }


    }
