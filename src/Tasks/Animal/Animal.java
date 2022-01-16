package Tasks.Animal;

public class Animal {
    public String name, breed, color,size;
    public int age;
    public char gender;

    public Animal(String name, String breed, String color, String size, int age, char gender) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.size = size;
        this.age = age;
        this.gender = gender;
    }
    public void eat(){
        System.out.println(name + " is eating!");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }


}



  /*  Animal Task:
        1. Create a class named Animal:
        Variables:
        name, breed, age, gender, size, color

        Add a constructor to set all the fields

        methods:
        eat()
        toString()

        2. Create the followin sub classes of Animal and override the eat method:
        1. Cat
        eat(): eats cat food

        2. Dog
        eat(): eats dog food

        3. Tiger
        eat(): eats deer

        4. Eagle
        eat(): eats snake */