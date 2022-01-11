package Day25_CustomMethod_Overloading;

import java.util.Arrays;

public class AddElementsToArray_Overloading {
    public static void main(String[] args) {
        String [] a = {"Just", "Do", "It", "!"};
        System.out.println(Arrays.toString(addElement(a,"Come On!" )));
        int [] b ={1,9,0};
        System.out.println(Arrays.toString(addElement(b,5)));
        
    }
    public static int [] addElement(int [] array, int element){
        int [] result = new int[array.length+1];
        int i =0;
        for (int i1 : array) {
            result[i++] = i1;
        }result [i] = element;

        return result;
    }
    public static String [] addElement(String [] array, String element){
        String [] result = new String[array.length+1];
        int i =0;
        for (String i1 : array) {
            result[i++] = i1;
        }result [i] = element;
        return result;
    }
}
