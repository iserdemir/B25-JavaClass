package Day21_ForEachLoop;

public class ReverseNames {
    public static void main(String[] args) {
        String [] names = {"Jayson Tatum", "Robert Williams", "Dennis Schroder", "Al Harford"};
        int count = 0;
        for (String name : names) {
            String reserved = "";
            for (int i = name.length()-1;i>=0;i--){
            reserved += name.charAt(i);
            }
            System.out.println(reserved);
        }
    }
}
