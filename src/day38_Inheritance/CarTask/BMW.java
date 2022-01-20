package day38_Inheritance.CarTask;

public class BMW extends Car {
    public BMW(String model, int year, double price, String color, int miles) {
        super(model, "BMW", year, price, color, miles);
    }

    @Override
    public void start() {
        System.out.println(brand + " " + model + " start with a button!");
    }
}
