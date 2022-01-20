package Tasks.Animal0117;

public class Lion extends WildAnimal{
    public Lion(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color, true, false, false);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating a bird!");
    }
}
