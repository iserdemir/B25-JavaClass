package day37_Inheritance.Phone;

public class Phone {
    public String brand, model,size;
    public double price;
    public String color;

    public Phone(String brand, String model, String size, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
    }
    public void call(){
        System.out.println(brand + " is calling..");
    }
    public void text(){
        System.out.println(model + " is texting...");
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand = '" + brand + '\'' +
                ", model = '" + model + '\'' +
                ", size = '" + size + '\'' +
                ", price = " + price +
                ", color = '" + color + '\'' +
                '}';
    }
}
