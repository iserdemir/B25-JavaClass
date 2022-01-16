package day36_Inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.setInfo("Nando", "Small", "Silver", "Ankara", 1,'F' );
        c.scratch();
        c.eat();
        c.sleep();
        Lion l = new Lion();
        l.setInfo("Gomis", "Big", "Black", "Wild", 33, 'M');
        l.roar();
    }
}
