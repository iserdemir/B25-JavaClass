package Day17_While_DoWhile;

public class FrequencyOfWord_WhileLoop {
    public static void main(String[] args) {
        String str = "Java Java Python Python";
        int freq = 0;
        while(str.contains("Java")){
            str = str.replaceFirst("Java", "");
            freq++;
        }
        System.out.println(freq);
        System.out.println("************");
        String sentence = "cat cat dog dog";
        int countcat = 0;
        while(sentence.contains("cat")){
            sentence = sentence.replaceFirst("cat", "");
            countcat++;
        }
    }
}
