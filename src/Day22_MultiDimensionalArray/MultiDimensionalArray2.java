package Day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArray2 {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3};
        int [] arr2 = {4,5,6};
        int [] arr3 = {7,8,9};

        int [][] arr2D = {{1,2,3},{4,5,6},{7,8,9}};

        //d dimensional array contains 2 d arrays
        //                      0       1       2           0           1          2
        int[][][] arr3D = {{{1,2,3},{4,5,6},{7,8,9}}, {{10,20,30},{40,50,60},{70,80,90}}};
        //                              0                               1
        //[index num of 2D array] [index num of 1d array] [index of elements]
        System.out.println(Arrays.deepToString(arr3D));
        System.out.println(Arrays.deepToString(arr3D[1]));
        System.out.println(arr3D[1][1][1]+ "\n");
        for (int[][] ints : arr3D) {
            for (int[] anInt : ints) {
                for (int i : anInt) {
                    System.out.print(i + ", ");
                }
            }

        }System.out.println();
        int[][][][] arr4D = {{{{1,2,3},{4,5,6},{7,8,9}}, {{10,20,30},{40,50,60},{70,80,90}}}};
        //                                              0
        for (int[][][] int3 : arr4D) {
            for (int[][] int2 : int3) {
                for (int[] int1 : int2) {
                    for (int i : int1) {
                        System.out.print(i + " ");
                    }System.out.println();

                }

            }


        }
    }
}
