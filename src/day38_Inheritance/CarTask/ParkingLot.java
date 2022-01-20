package day38_Inheritance.CarTask;

public class ParkingLot {
    public static void main(String[] args) {
        Toyota t = new Toyota("Prius", 2007, 6600, "Gray", 122321);
        t.start();
        t.stop();
        BMW b = new BMW("520i", 2017, 27350,"Blue", 18900);
        b.start();
        b.stop();
        Tesla ts = new Tesla("Y", 2021, 57680,  "White", 710);
        ts.start();
        ts.stop();
    }
}
