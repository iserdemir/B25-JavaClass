package Tasks;

public class CharRepeat_forloop {
    public static void main(String[] args) {
        String str = "aabccd";
        char c = 'c';
        String str1 = "Java programming language";
        char g = 'g';
        int x = 0;
        int y = 0;
        for (int i = 0; i <= str.length() - 1; i++) {
            char a = str.charAt(i);

            if (a == c) {
                x++;
            }
        } System.out.println("c = " + x);

        for (int h = 0; h < str1.length(); h++) {
            char b = str1.charAt(h);

            if (g == b) {
                y++;
            }
        } System.out.println("g = " + y);

    }
}
