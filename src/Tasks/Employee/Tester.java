package Tasks.Employee;

public class Tester extends Employee{
    public Tester(String name, String id,  int age, int salary, char gender) {
        super(name, id, "Tester", "Celtics", age, salary, gender);
    }

    @Override
    public void work() {
        System.out.println(name + " is working at " + companyName + "as a tester");
    }
}
