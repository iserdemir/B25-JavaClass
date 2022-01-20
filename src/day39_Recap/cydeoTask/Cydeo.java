package day39_Recap.cydeoTask;

public class Cydeo {
    public static void main(String[] args) {
        Developer d = new Developer("Tatum", 24, 'M', 0, 7100);
        Student s = new Student("Iso", 29, 'M');
        Tester t = new Tester("Kerem", 23, '-', 7,5000);
        System.out.println(d);
        d.work();
        System.out.println(t);
        t.work();
        t.test();
        System.out.println(s);
        s.course();

    }
}
