package Tasks.CarShop;

public class CarShop {
    public static void main(String[] args) {
        Audi a = new Audi("Audi", "A4", 2020,28325, "Blue");
        a.autoPark();
        BMW b = new BMW("BMW", "116i", 2011,12369,"White");
        b.drive();
        CydeoCar c = new CydeoCar("Cydeo", "B25", 2022, 12000, "Red");
        c.fly();
        c.selfDrive();
        Honda  h = new Honda("Honda", "Accord", 1776, 29785,"Ocean");
        h.start();

    }
}
