package Tasks;

public class frequencyOfWords1212 {
    public static void main(String[] args) {
        frequency("java,java,Java,python", "java");
    }

    public static String frequency(String sentence, String word) {
        String[] arr = sentence.split(",");
        int freq = 0;
        for (String s : arr) {
        if (s.equalsIgnoreCase(word)) {
                freq++;
        }
        }System.out.println(word + " = " + freq);
        return sentence;
    }
}
