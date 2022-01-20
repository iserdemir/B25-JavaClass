package Tasks.Animal0117;

public class Animal {
    private String name,breed;
    private char gender;
    private int age;
    private String size, color;

    public Animal(String name, String breed, char gender, int age, String size, String color) {
      setName(name);
      setBreed(breed);
      setGender(gender);
      setAge(age);
      setSize(size);
      setColor(color);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name ==null){
            System.err.println("Invalid Value!" + "\nPlease enter a value");
        }
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if (name ==null){
            System.err.println("Invalid Value!" + "\nPlease enter a value");
        }
        this.breed = breed;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (!(gender=='M' || gender=='F')){
            System.err.println("Invalid Value");
        }
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<0){
            System.err.println("Invalid Value");
        }
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (name ==null){
            System.err.println("Invalid Value!" + "\nPlease enter a value");
        }
        this.color = color;
    }
    public void eat(){
        System.out.println(name + " is eating!");
    }
    public void drink(){
        System.out.println(name + " is drinking!");
    }
    public void sleep(){
        System.out.println(name + " is sleeping!");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

