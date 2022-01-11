package Day21_ForEachLoop;

public class UniqueElement {
    public static void main(String[] args) {
        String []words = {"Nando", "Marcao", "Morutsan", "Berkan", "Nando", "Marcao", "Baris"};
         for (String each : words) {
             int count = 0;
             for (String word : words) {
                 if (word.equals(each)){
                     count++;
                 }

             } if (count ==1){
                 System.out.println(each);
             }
         }
    }
}
