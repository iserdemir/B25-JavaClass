package Tasks;

public class Palindromes_Array {
    public static void main(String[] args) {
        String [] str = {"anna", "level", "Java"};
int count = 0;
        for (String s : str) {

            String b= "";
            for (int i = s.length()-1; i >=0 ; i--) {
                 b += s.charAt(i);
                if (b.equals(s)){
                    count++;
            }
            }

        }System.out.println(count);

    }
}
