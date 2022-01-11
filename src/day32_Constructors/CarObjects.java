package day32_Constructors;

public class CarObjects {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota");
        Car car2 = new Car("Honda", "Civic");
        Car car3 = new Car("Tesla", "Y", 2022);
        Car car4 = new Car("Porsche", "Muscan", 2022, 120000);
        Car car5 = new Car("BMW", "i5", "White", 2020, 110000);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
    }
}
