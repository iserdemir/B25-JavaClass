package Tasks.Animal;

public class Tiger extends Animal{
    public Tiger(String name, String breed, String color, String size, int age, char gender) {
        super(name, breed, color, size, age, gender);
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating deer!");
    }
}
