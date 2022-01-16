package day37_Inheritance.Phone;

public class Samsung extends Phone{
    public Samsung( String model, String size, double price, String color) {
        super("Samsung", model, size, price, color);
    }
    public void play(String game){
        System.out.println(brand + " " + model + " is playing on " + game);
    }
}
