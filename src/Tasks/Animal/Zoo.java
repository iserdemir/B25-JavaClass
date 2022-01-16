package Tasks.Animal;

public class Zoo {
    public static void main(String[] args) {
        Cat c = new Cat("Nando", "Van", "White", "Small", 1,'F');
        System.out.println(c);
        c.eat();
        Dog d = new Dog("Melo", "Golden", "Brown", "Medium", 2, 'M');
        System.out.println(d);
        d.eat();
        Eagle e = new Eagle("Tatum", "None", "Black", "Medium", 7, 'M');
        System.out.println(e);
        e.eat();
        Tiger t = new Tiger("Falcao", "Colombia", "Yellow", "Large", 11, 'M');
        System.out.println(t);
        t.eat();
    }
}
