package Tasks.Animal0117;

public class Dolphin extends FriendlyAnimal{
    public Dolphin(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color, false, true, true);
    }
public void swim(){
    System.out.println(getName() + " is swimming..");
}
    @Override
    public void eat() {
        System.out.println(getName()  + " is eating hamsi!");
    }
}
