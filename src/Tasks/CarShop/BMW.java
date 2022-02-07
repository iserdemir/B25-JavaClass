package Tasks.CarShop;

public class BMW extends Car{
    public BMW(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println(getMake() + " " + getModel() + " starts with a button!");
    }

    @Override
    public void drive() {
        System.out.println("Muhtar drives a " + getMake() + " " + getModel() );
    }
}
