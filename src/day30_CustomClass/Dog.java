package day30_CustomClass;

public class Dog {
    public String name;
    public int age;
    public String breed;
    public String size;
    public String color;
    public char gender;

    public void setInfo(String dogName, int dogAge, String dogBreed, String dogSize, String dogColor, char dogGender){
        name = dogName;
        breed = dogBreed;
        age = dogAge;
        size = dogSize;
        color = dogColor;
        gender = dogGender;
    }

    public void eat(){
        System.out.println(name + "is eating.");
    }
    public void bark(){
        System.out.println(name + "is barking.");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                '}';
    }
}
/*
Attributes:
name,age,gender,breed,size,color

Actions:
eat(), play(), bark(), sleep()...

 */