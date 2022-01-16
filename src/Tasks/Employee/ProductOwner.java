package Tasks.Employee;

public class ProductOwner extends Employee{
    public ProductOwner(String name, String id,  int age, int salary, char gender) {
        super(name, id, "PO", "Celtics", age, salary, gender);
    }

    @Override
    public void work() {
        System.out.println(name + " is working at " + companyName + "as a PO");
    }

}
