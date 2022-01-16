package Tasks.Employee;

public class Developer extends Employee {
    public Developer(String name, String id, int age, int salary, char gender) {
        super(name, id, "Developer", "Celtics", age, salary, gender);
    }

    @Override
    public void work() {
        System.out.println(name + " is working at " + companyName + "as a developer");
    }
}

