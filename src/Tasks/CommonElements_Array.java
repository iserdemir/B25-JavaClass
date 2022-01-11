package Tasks;

public class CommonElements_Array {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = {4,6,8,5,2};
        int num1 = 0;
        int num2 = 0;
        for (int i : arr1) {
            num1 = i;
            for (int i1 : arr2) {
                num2 = i1;
                if (num1 == num2){
                    System.out.print(num1 + " ");

                }
            }
        }
    }
}
