package day38_Inheritance.CarTask;

public class Toyota extends Car{
    public Toyota(String model, int year, double price, String color, int miles) {
        super(model, "Toyota", year, price, color, miles);

    }

    @Override
    public void start() {
        System.out.println(brand + " " + model + " starts with a key!");
    }
}
