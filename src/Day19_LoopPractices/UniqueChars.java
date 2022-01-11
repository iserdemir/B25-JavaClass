package Day19_LoopPractices;

public class UniqueChars {
    public static void main(String[] args) {
        String str = "aabghyytsd";
        String result = "";
        for (int i = 0; i < str.length() ; i++) {
            char ch = str.charAt(i);
            int num = 0;
            for (int j = 0; j < str.length(); j++) {
                char each = str.charAt(j);
                if (ch == each) {
                    num++;
                }
            }
                if (num!=1) {
                    continue;
                }
            result+=ch;
        }
        System.out.println(result);
    }
}
