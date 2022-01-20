package day39_Recap.cydeoTask;

public class Student extends Person{
    public Student(String name, int age, char gender) {
        super(name, age, gender);
    }
    public void course(){
        System.out.println(getName() + " is paying thousand dollars!");
    }
}
