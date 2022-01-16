package day37_Inheritance.Phone;

public class Iphone extends Phone{
    public Iphone(String model, String size, double price, String color) {
        super("iPhone", model, size, price, color);
    }
    public void faceTime(long phoneNumber){
        System.out.println(brand + " " +model + " is making a video call with " + "'"+ phoneNumber + "'");
    }
}
