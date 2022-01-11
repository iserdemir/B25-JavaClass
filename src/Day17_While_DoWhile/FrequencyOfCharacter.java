package Day17_While_DoWhile;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
       String str = "AAABBHJSMASDASD";
       char a = 'B';
       int freq = 0;
        for (int i = 0; i <str.length() ; i++) {
            if (a == str.charAt(i)){
                freq++;
            }

        }
        System.out.println(freq);



    }
}

