package july8;

import java.util.Scanner;

public class SwitchDemoSecond {
    public static void main(String[] args) {
        System.out.println(" Welcome to Home");
        System.out.println("1.Blue bulb");
        System.out.println("2.Red bulb");
        System.out.println("3.Fan");
        System.out.println("4.Nothing");

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter your input");
        int input = scanner.nextInt();

        switch(input) {
            case 1:
                System.out.println(" Switch on the blue bulb");
                break;

            case 2:
                System.out.println(" Switch on the red bulb");
                break;

            case 3:
                System.out.println(" Switch on the Fan");
                break;

            case 4:
                System.out.println(" Nothing");
                break;

            default:
                System.out.println("wrong input");


        }
    }
}
//System.err.println("wrong input"), if you hit any other number or string- "wrong output" display at red color.
// can't validate the wrong input.