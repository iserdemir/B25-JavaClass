package day20_Arrays;

public class UniqueElement {
    public static void main(String[] args) {
        String [] str = {"Max", "Lewis", "Checo", "Checo", "Lewis", "Leclerc"};


        for (int i = 0; i < str.length; i++) {
            String result = str[i] ;
            int num = 0;
            for (int i1 = 0; i1 < str.length; i1++) {
                if (str[i1].equals(result)){
                    num++;
                }
                }if (num ==1){
                System.out.println(result);
            }
        }
    }
}
