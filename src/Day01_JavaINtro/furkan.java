package Day01_JavaINtro;

public class furkan {
    public static void main(String[] args) {
       reverseNumber(15681);
        reverseNumber(2582);
        reverseNumber(1401010);
        reverseNumber(1905);
        reverseNumber(2251000);
        reverseNumber(5040);

    }

    public static void reverseNumber (int a){


        int result = 0;
        int remainder =0;
        while(a>0){
            remainder = a%10;
            result =  (result*10)+remainder;
            a=a/10;
        }
        System.out.println(result);
    }

}
