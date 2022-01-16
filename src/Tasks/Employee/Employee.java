package Tasks.Employee;

public class Employee {
    public String name, id, jobTitle, companyName;
    public int age,salary;
    public char gender;

    public Employee(String name, String id, String jobTitle, String companyName, int age, int salary, char gender) {
        this.name = name;
        this.id = id;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
    }
    public void work(){
        System.out.println(name + " is working at " + companyName);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name = '" + name + '\'' +
                ", id = '" + id + '\'' +
                ", jobTitle = '" + jobTitle + '\'' +
                ", companyName = '" + companyName + '\'' +
                ", age = " + age +
                ", salary = " + salary +
                ", gender = " + gender +
                '}';
    }
}





/*
Employee Task:
	1. Create a class named Employee
			Variables:
				name, age, gender, id, jobTitle, salaryName, comapnyName

			Add a constructor to set all the fields

			Methods:
				work()
				toString()


	2. Create ethe following subclasses and override the work method in each subclass:

			1. Tester
			2. Developer
			3. ProductOwner
			4. BusinessAnalyst
			5. ScrumMaster
			6. Teacher
			7. Driver
			9. Pilot

		if any adidtional field or methods needed, please add them
 */