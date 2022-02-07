package Tasks.CarShop;

public abstract class Car {
    private final String make;
    private final String model;
    private final int year;
    private double price;
    private String color;

    public Car(String make, String model, int year, double price, String color) {
        if (make.isEmpty()){
            throw new RuntimeException("Make cannot be empty! " + make);
        }
        this.make = make;
        if (model.isEmpty()){
            throw new RuntimeException("Model cannot be empty! " + model);
        }
        this.model = model;
        if (year<1886){
            throw new RuntimeException("Year cannot be less than 1886! " + year);
        }
        this.year = year;
        setColor(color);
        setPrice(price);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price<0){
            throw new RuntimeException("Price cannot be less than 0 " + price);
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.isEmpty()){
            throw new RuntimeException("Color cannot be empty! " + color);
        }
        this.color = color;
    }
    public abstract void start();

    public abstract void drive();

    public void stop(){
        System.out.println(getMake() + " " + getModel() + " is stopped!");
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
