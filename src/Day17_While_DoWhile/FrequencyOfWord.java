package Day17_While_DoWhile;

public class FrequencyOfWord {
    public static void main(String[] args) {
        String str = "JavaJavaJavaJavaJava";
        int freq = 0;
        for (int i = 0; i <= str.length()-4 ; i++) {
            String eachSub = str.substring(i,i+4);
            if (eachSub.equals("Java")){
                freq++;
            }

        }
        System.out.println(freq);
    }
}
