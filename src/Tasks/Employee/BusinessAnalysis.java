package Tasks.Employee;

public class BusinessAnalysis extends Employee{
    public BusinessAnalysis(String name, String id,  int age, int salary, char gender) {
        super(name, id, "BA", "Celtics", age, salary, gender);
    }

    @Override
    public void work() {
        System.out.println(name + " is working at " + companyName + "as a BA");
    }

}
