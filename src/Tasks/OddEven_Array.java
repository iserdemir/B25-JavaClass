package Tasks;

public class OddEven_Array {
    public static void main(String[] args) {
        int [] number = {1,5,9,3,4,6};
        int even =0;
        int odd=0;
        for (int i : number) {
            if (i%2==0){
                even++;
            } else {
                odd++;
            }

        }
        System.out.println("Even = " + even + " Odd = " +odd);
    }
}
