package Day24_CustomMethods_Return;

public class ReturnMethodIntro {
    public static void main(String[] args) {
        reverse("Oh Captain!");
    }
    public static String reverse(String name){
        String str="";
        for (int i = name.length()-1; i >=0 ; i-- ){
            str += name.charAt(i);
        }
        System.out.println(str);
        return str;
    }
}
