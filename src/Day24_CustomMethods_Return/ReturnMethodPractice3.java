package Day24_CustomMethods_Return;

public class ReturnMethodPractice3 {
    public static void main(String[] args) {
     String str = "aabbcdgge";
      /*  for (int i = 0; i <=str.length()-1 ; i++) {
            int frequency = frequency(str, 'a');
        if (frequency==1){
            System.out.println(str.charAt(i));
        }
        }*/
       String a ="g: " + frequency(str,'g');
        System.out.println( a);

    }
    public static int frequency(String str, char ch){
        int count = 0;
        for (char each : str.toCharArray()) {
            if (each == ch){
                count++;
            }
        } return count;

    }
}
