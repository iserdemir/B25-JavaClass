package Day21_ForEachLoop;

import java.util.Arrays;

public class ArrayUtility2 {
    public static void main(String[] args) {
        //copyOf(array, newLength): it always starts with first element!
        String [] names = {"Tatum", "Williams", "Schroder", "Al Harford"};
        String [] batch = {"Freedom", "Pritchard", "Brown", "Smart"};
        String [] stars = Arrays.copyOf(names, 2);
        System.out.println(Arrays.toString(stars));
        System.out.println("***************");
        int [] num = {5,9,4,6,7,9,2,6,7};
        num = Arrays.copyOfRange(num,2, 8);// to --> excluded
        System.out.println(Arrays.toString(num));
        System.out.println("****************");
        String [] player = {"Sneijder", "Drogba", "Burak", "Selcuk", "Melo", "Amrabat", "Eboue"};
        player = Arrays.copyOfRange(player, 2, player.length);
        System.out.println(Arrays.toString(player));


    }
}
