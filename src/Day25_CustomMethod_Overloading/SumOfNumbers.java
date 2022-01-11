package Day25_CustomMethod_Overloading;

public class SumOfNumbers {
    public static void main(String[] args) {
        int sum = sumOf2Numbers(1,2);
        int sum1 = sumOf3Numbers(1,2,3);
        int sum2 = sumOf4Numbers(1,2,3,4);
        System.out.println(sum);
        System.out.println(sum1);
        System.out.println(sum2);
    }
    public static int sumOf2Numbers(int n1, int n2){
        return  n1 + n2;
    }
    public static int sumOf3Numbers(int n1, int n2, int n3){
        return n1+n2+n3;
    }
    public static int sumOf4Numbers(int n1, int n2, int n3, int n4){
        return n1+n2+n3 +n4;
    }
}
