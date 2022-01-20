package day39_Recap.cydeoTask;

public class Developer extends Employee{
    public Developer(String name, int age, char gender, int employeeID, double salary) {
        super(name, age, gender, employeeID, "Developer", salary);
    }
    public void develop(){
        System.out.println(getEmployeeID() + " " + getName() + "develops something.");

    }

    @Override
    public void work() {
        System.out.println(getName() + " is fixing bugs.");
    }
}
