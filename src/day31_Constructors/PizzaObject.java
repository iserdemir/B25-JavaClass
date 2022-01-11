package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaObject {
    public static void main(String[] args) {

        ArrayList<Pizza> orders = new ArrayList<>();

        for (int i = 0; i<100;i++){
            Pizza order1 = new Pizza('S', 3, 2);
            Pizza order2 = new Pizza('M', 3, 4);
            Pizza order3 = new Pizza('L', 1, 5);
            orders.addAll(Arrays.asList(order1,order2,order3));

        }
        System.out.println("Total number of pizzas: " + orders.size());
        double price = 0;
        for (Pizza order : orders) {
            price +=order.calcCost();

        }
        System.out.println("Total price: " + price);
    }
}
