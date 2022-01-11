package day30_CustomClass;

import java.util.ArrayList;

public class StudentObjects {
    public static void main(String[] args) {
        Student list = new Student();
        list.setInfo("Tatum", 'M', 23, 0,'A');

        Student list1 = new Student();
        list1.setInfo("Brown", 'M', 22, 7,'A');

        Student list2 = new Student();
        list2.setInfo("Smart", 'M', 27, 36,'B');

        Student[] students = {list,list1,list2};

        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("****************");
        ArrayList<Student> earlyBirds = new ArrayList<>();
        ArrayList<Student> angryBirds = new ArrayList<>();
        for (Student student : students) {
        if (student.grade=='A') {
            earlyBirds.add(student);
        }else
        angryBirds.add(student);
        }

    }
}
