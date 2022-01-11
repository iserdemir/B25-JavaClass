package day28_ArrayList;

import java.util.ArrayList;

public class UniqueElement {
    public static void main(String[] args) {

    ArrayList<String> employees = new ArrayList<>();
        employees.add("Tatum");
        employees.add("Brown");
        employees.add("Williams");
        employees.add("Horford");
        employees.add("Smart");
        employees.add("Schroder");
        employees.add("Brown");
        employees.add("Schroder");
        employees.add("Horford");
        ArrayList<String> unique = new ArrayList<>();
        for (String employee : employees) {
            if (employees.indexOf(employee)==employees.lastIndexOf(employee)){
                unique.add(employee);
            }
        }
        System.out.println(unique);
    }

}
