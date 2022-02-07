package Tasks.CarShop;

public class CydeoCar extends Car implements AutoPilot,AutoPark,Flyable {
    public CydeoCar(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void selfDrive() {
        System.out.println(getMake() + " " + getModel() + " have also a self-driving!");
    }

    @Override
    public void autoPark() {

    }

    @Override
    public void fly() {
        System.out.println("If you believe, "+ getMake() + " " + getModel() + " can fly!");
    }

    @Override
    public void start() {

    }

    @Override
    public void drive() {

    }
}
