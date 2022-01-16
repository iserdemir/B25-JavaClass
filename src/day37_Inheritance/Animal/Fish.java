package day37_Inheritance.Animal;

public class Fish extends Animal{
    public Fish(String name, String breed, char gender, int age, String color) {
        super(name, breed, gender, age, color);
    }
    public void swim(){
        System.out.println(name + " is swimming!");
    }
}
