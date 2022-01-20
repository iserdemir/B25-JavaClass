package Tasks.Animal0117;

public class Cat extends FriendlyAnimal{
    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color, false, true, true);
    }
    public void meow(){
        System.out.println(getName() + " is meowing");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating a fish!");
    }
}
