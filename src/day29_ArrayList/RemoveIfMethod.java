package day29_ArrayList;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.jar.JarOutputStream;

public class RemoveIfMethod {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
       /* for (int i = 0; i < list.size(); i++) {
            if (list.get(i)%2!=0){
                list.remove(i);
            }
        } */
        //System.out.println(list);
        list.removeIf(p -> p>5);
        System.out.println(list);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list2.removeIf(each-> each%2==0);
        System.out.println(list2);
        System.out.println("*********");
        ArrayList<String> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList("Java","Javascript","c++","Pyhton","java"));
        list3.removeIf(p-> p.startsWith("J"));
        System.out.println(list3);
        System.out.println("************");
        ArrayList<String> list4 = new ArrayList<>();
        list4.addAll(Arrays.asList("Anna","Iso","Eye","Level","Tatum"));
        list4.removeIf(name-> !StringUtility.isPalindrome(name));
        System.out.println(list4);
    }
}
