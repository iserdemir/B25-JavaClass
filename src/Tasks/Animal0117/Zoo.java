package Tasks.Animal0117;

public class Zoo {
    public static void main(String[] args) {
        Dog d= new Dog("James", "Pitbull", 'F', 11, "Medium", "Black");
        System.out.println(d);
        Lion l = new Lion("Cimbom", "Turkish", 'M', 1905, "Big", "yellow-Red");
        l.setName("Gomis");
        l.hunt();
    }
}
