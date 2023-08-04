package Assignment;

import java.util.Scanner;

public class StringAddress {
    public static void main(String[] args) {
        System.out.println("Address with pincode");
        System.out.println("Pragra");
        System.out.println("CNTower");
        System.out.println("Aquarium");

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter your address with pincode :");
        String address = scanner.next();

        switch (address) {

            case ("Pragra"):
                System.out.println(" 110 Matheson Blvd W #160, Mississauga, ON L5R 4G7 ");
                break;

            case ("CNTower"):
                System.out.println(" 290 Bremner Blvd, Toronto, ON M5V 3L9");
                break;

            case ("Aquarium"):
                System.out.println("288 Bremner Blvd, Toronto, ON M5V 3L9");
                break;

            default:
                System.out.println("wrong input address");
        }
    }

}



