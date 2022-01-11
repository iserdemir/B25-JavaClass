package Day25_CustomMethod_Overloading;

public class MethodOverloading {
    public static void main(String[] args) {
        int[] intArray = {5,7,-4,5,6};
        double[] dArray = {7.1 ,19.05, 25.82};
        char [] charArray = {'h', 'e', 'r', 'e'};
        int sum = sumOfNumbers(1,2);
        double sum1 = sumOfNumbers(1.9,2.5,3.7);
        int sum2 = sumOfNumbers(1,2,3,4);
        System.out.println(sum);
        System.out.println(sum1);
        System.out.println(sum2);
    }


    public static int sumOfNumbers(int n1, int n2){
        return  n1 + n2;
    }
    public static double sumOfNumbers(double n1, double n2, double n3){
        return n1+n2+n3;
    }
    public static int sumOfNumbers(int n1, int n2, int n3, int n4){
        return n1+n2+n3 +n4;
    }


}
