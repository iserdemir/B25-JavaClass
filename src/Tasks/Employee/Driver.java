package Tasks.Employee;

public class Driver extends Employee{
    public Driver(String name, String id,  int age, int salary, char gender) {
        super(name, id, "Driver", "Celtics", age, salary, gender);
    }

    @Override
    public void work() {
        System.out.println(name + " is working at " + companyName + "as a driver");
    }

}
