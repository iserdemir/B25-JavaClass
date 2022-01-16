package day36_Inheritance.animalTask;

public class Animal {
    public  String name, size, color, breed;
    public int age;
    public char gender;

    public void setInfo(String name, String size, String color,String breed, int age, char gender) {
        this.name = name;
        this.size = size;
        this.color = color;
        this.age = age;
        this.gender = gender;
        this.breed = breed;
    }
    public void eat(){
        System.out.println(name + " is eating");
    }
    public void drink(){
        System.out.println(name + " is drinking");
    }
    public void move(){
        System.out.println(name + " is moving");
    }
    public void sleep(){
        System.out.println(name + " is slepping");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
