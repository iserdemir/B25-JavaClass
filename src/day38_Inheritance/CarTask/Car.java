package day38_Inheritance.CarTask;

public class Car {
    public String model,brand;
    public int year;
    public double price;
    public String color;
    public int miles;

    public Car(String model, String brand, int year, double price, String color, int miles) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.color = color;
        this.miles = miles;
    }
    public void start(){
        System.out.println(brand + " " + model + " i s starting!");
    }
    public void stop(){
        System.out.println(brand + " " + model + " is stopping!");
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", miles=" + miles +
                '}';
    }
}
