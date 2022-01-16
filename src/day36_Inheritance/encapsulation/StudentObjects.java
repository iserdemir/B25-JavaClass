package day36_Inheritance.encapsulation;

public class StudentObjects {
    public static void main(String[] args) {
        Student s = new Student("Tatum", 24,'M','A',"Celtics");
        s.setAge(25);
        System.out.println(s);
    }
}
