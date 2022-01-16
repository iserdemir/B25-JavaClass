package day37_Inheritance.Animal;

public class Cat extends Animal{
    public Cat(String name, String breed, char gender, int age, String color) {
        super(name, breed, gender, age, color);
    }
    public void meow(){
        System.out.println(name + " is meowing!");
    }
}
