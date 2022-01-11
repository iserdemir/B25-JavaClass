package Tasks;

import java.util.Scanner;

public class Elevator_ifstatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your floor:");
        int floorNum = scan.nextInt();
        if (floorNum == 1){
            System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
        }
        else if (floorNum == 2){
            System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");
        }
        else if (floorNum == 3){
            System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake house");
        } else
            System.out.println("Invalid Floor");
    }
}
