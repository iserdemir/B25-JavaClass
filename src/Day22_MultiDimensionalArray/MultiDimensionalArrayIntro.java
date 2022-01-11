package Day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {
    public static void main(String[] args) {
        String [] group1 = {"Tatum",  "Schroder", "Smart"};
        String [] group2 = {"Al Harford", "Williams", "Schroder", "Smart", "Freedom"};
        String [] group3 = {"Tatum", "Brown", "Schroder", "Smart", "Prittchard"};
        String [][] groups = new String[3][];
        groups[0] = group1;
        groups[1] = group2;
        groups[2] = group3;
        System.out.println(Arrays.deepToString(groups));//toString() is for single dimensional arrays only
        System.out.println("******************");
        int [] [] arr2D = {{1,2,3}, {4,5,6,7}, {8,9,10,11,12,13}};
        int number = arr2D.length;
        int number1 = arr2D[1].length;
        System.out.println(number1);
        System.out.println(number);
        System.out.println(Arrays.deepToString(arr2D));
        System.out.println(arr2D[1][3]);
    }
}
