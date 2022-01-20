package day38_Inheritance.CarTask;

public class Tesla extends Car{
    public Tesla(String model,  int year, double price, String color, int miles) {
        super(model,"Tesla", year, price, color, miles);
    }

    @Override
    public void start() {
        System.out.println(brand + " " + model + " starts with a mobile app!");
    }
}
