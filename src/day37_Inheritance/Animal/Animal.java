package day37_Inheritance.Animal;

public class Animal {
    public String name,breed;
    public char gender;
    public int age;
    public String color;

    public Animal(String name, String breed, char gender, int age, String color) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        this.color = color;
    }
    public void eat(){
        System.out.println(name + " is eating!");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
