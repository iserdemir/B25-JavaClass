package Day22_MultiDimensionalArray;

public class IteratingMultiDimensionalArray {
    public static void main(String[] args) {
        int [][]arr2D = {{1,2,3}, {4,5,6,7,8}, {9,10,11,12,13}};
        for (int i = arr2D.length-1; i >=0 ; i--) {
            for (int j = arr2D[i].length-1; j >=0 ; j--) {
                int result = arr2D[i][j];
                System.out.print(result + " ");
            }
            System.out.println();
        }
    }
}
