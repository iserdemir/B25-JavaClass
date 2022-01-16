package day37_Inheritance.Animal;

public class AnimalObject {
    public static void main(String[] args) {
        Cat c = new Cat("Max", "Dutch", 'M', 24,"Yellow");
        Dog d = new Dog("Lewis", "British", 'M', 35,"Brown");
        Fish f = new Fish("George", "British", 'M', 24, "White");
        c.meow();
        d.bark();
        f.eat();
    }
}
