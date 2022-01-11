package day28_ArrayList;

import java.util.ArrayList;

public class RemoveDuplicate {
    public static void main(String[] args) {
        ArrayList<String> employees = new ArrayList<>();
        employees.add("Tatum");
        employees.add("Brown");
        employees.add("Williams");
        employees.add("Horford");
        employees.add("Smart");
        employees.add("Schroder");
        employees.add("Brown");
        employees.add("Smart");
        System.out.println(employees);
        ArrayList<String> news = new ArrayList<>();
        int i =0;
        for (String employee : employees) {
            if (news.contains(employee)) {
                continue;
            }
news.add(employee);
        }
        System.out.println(news);
    }
}
