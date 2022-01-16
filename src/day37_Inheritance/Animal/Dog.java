package day37_Inheritance.Animal;

public class Dog extends Animal{
    public Dog(String name, String breed, char gender, int age, String color) {
        super(name, breed, gender, age, color);
    }
    public void bark(){
        System.out.println(name + " is barking!");
    }
}
