package Day18_NestedLoop;

public class NestedLoopPractice2 {

    public static void main(String[] args) {


//        for (int i = 3; i >=0; i--) {
//
//
//
//
//            for (int b = 1; b <= 5; b +=2 ) {
//
//
//
//            }System.out.println(x);
//
//        }
        int n=9;
        for(int i=1;i<=n;i++){
            int j = n-i;
            for(int k =j;k>=1;k--){
                System.out.print(" ");
            }
            for(int m=1;m<=i; m += 1){
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }
}



