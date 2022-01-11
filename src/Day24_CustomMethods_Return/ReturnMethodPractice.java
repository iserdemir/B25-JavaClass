package Day24_CustomMethods_Return;

public class ReturnMethodPractice {
    public static void main(String[] args) {
        maxNumber(100,200);
    }
    public static void maxNumber(int a, int b){
       int result = 0;
       if (a>b){
           result=a;
       }else{
           result=b;
       }
        System.out.println(result);

    }
    public static int max(int a, int b){
        int result = 0;
        if (a>b){
            result=a;
        }else{
            result=b;
        }
        System.out.println(result);
        return result;
    }

}
