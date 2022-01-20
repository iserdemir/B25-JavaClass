package day39_Recap.cydeoTask;

public class Tester extends Employee{
    public Tester(String name, int age, char gender, int employeeID, double salary) {
        super(name, age, gender, employeeID, "Tester", salary);
    }
    public void test(){
        System.out.println(getEmployeeID() + " " + getName() + " is testing every single thing ;)");
    }

    @Override
    public void work() {
        System.out.println(getName() + " always find a bug.");
    }
}
