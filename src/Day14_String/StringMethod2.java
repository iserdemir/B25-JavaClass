package Day14_String;

public class StringMethod2 {
    public static void main(String[] args) {
        String str = "I love you and I'll keep loving you";
        str = str.replace("you", "Galatasaray");
        System.out.println("str = " + str);
    
        String sentence = "Tatum Brown Smart Smart Shroder Harford";
        sentence = sentence.replace("Smart", "Richardson");
        System.out.println("sentence = " + sentence);
        sentence = sentence.replace("Richardson ", "");
        sentence= sentence.trim();
        System.out.println("sentence = " + sentence);

        System.out.println("*******************");
        
        String result = "Doncic Doncic Doncic";
        result = result.replaceFirst("Doncic", "Luka");
        result = result.replaceFirst("Doncic", "Magic");
        System.out.println("result = " + result);
    
    }
}
