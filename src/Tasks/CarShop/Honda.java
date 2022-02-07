package Tasks.CarShop;

public class Honda extends Car{
    public Honda(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println(getMake() + " " + getModel() + " starts with a key!");
    }

    @Override
    public void drive() {
        System.out.println(getMake() + " " + getModel() + " is driven!");
    }
}
