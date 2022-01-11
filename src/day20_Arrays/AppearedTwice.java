package day20_Arrays;

public class AppearedTwice {
    public static void main(String[] args) {
        char [] ch = {'A', 'A','A' ,'B', 'B', 'C', 'D'};
        for (int i = 0; i <ch.length ; i++) {
            char each = ch[i];
            int frequency = 0;
            for (int j = 0; j <ch.length ; j++) {
                if (ch[j] == each){
                    frequency++;
                }

                }
            if (frequency == 2){
                System.out.println(each);
            }


        }
    }
}
