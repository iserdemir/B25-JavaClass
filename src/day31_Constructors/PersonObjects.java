package day31_Constructors;

public class PersonObjects {
    public static void main(String[] args) {
        Person person1 = new Person("Zendaya", 'F', 26);
        System.out.println(person1);
        Person person2 = new Person("Nando", 'M', 35);
        person2.age = 37;
        System.out.println(person2);
    }
}
