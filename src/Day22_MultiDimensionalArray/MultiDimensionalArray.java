package Day22_MultiDimensionalArray;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int [][]arr2D = {{1,2,3}, {4,5,6,7,8}, {9,10,11,12,13}};
       for (int i = arr2D.length-1; i >=0 ; i--) {
            for (int i1 : arr2D[i]) {
                int j = i1;
                if (i!=arr2D.length-1){
                    continue;
                }
                System.out.print(j + " ");
            }   System.out.println();
        }
        System.out.println("***************");
       for (int i = 0; i <= arr2D.length-1 ; i++) {
           int j =0;
            for (int i1 = arr2D.length-1; i1 >= 0; i1--) {
                 j = i1;
                System.out.println(j + " ");
            }
            System.out.println();

        }
        System.out.println("*********************");



    }
}
