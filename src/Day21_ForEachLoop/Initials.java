package Day21_ForEachLoop;

public class Initials {
    public static void main(String[] args) {
        String [] names = {"Jayson Tatum", "Robert Williams", "Dennis Schroder", "Al Harford"};
       /* for (String each : names) {
            String initial = each.charAt(0)+ "." + each.charAt(each.indexOf(" ")+1);
            System.out.println(initial);
        }*/
        for (String name : names) {
            String initials = name.charAt(0) + "." + name.charAt(name.indexOf(" ")+1);
            System.out.println(initials);
        }
    }
}
