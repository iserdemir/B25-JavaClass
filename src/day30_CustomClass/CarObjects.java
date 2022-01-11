package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.model = "Prius";
        car1.brand = "Toyota";
        car1.price = 6000;
        car1.year = 2007;
        car1.color = "Gray";
        System.out.println(car1);

        Car car2 = new Car();
        car2.setInfo("Mercedes", "C300", "White", 2017, 32000);
        System.out.println(car2);

        Car car3 = new Car();
        car3.setInfo("Tesla", "Y", "White", 2022, 72000);
        System.out.println(car3);

//Car [] cars = {car1, car2, car3};
        ArrayList<Car> cars = new ArrayList<>();
        cars.addAll(Arrays.asList(car1, car2, car3));
      //  System.out.println(cars);
        for (Car each : cars) {
            System.out.println(each.brand + " : " + each.price);
        }
        System.out.println("***********");
        cars.removeIf(p-> p.brand.equals("BMW") && p.year >=2005 && p.year <=2008);
        cars.removeIf(p-> p.brand.equals("Toyota") && p.year>=1997&&p.year<=2001);
    }
}
