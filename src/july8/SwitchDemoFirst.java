package july8;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SwitchDemoFirst {
    public static void main(String[] args) {
        System.out.println(" Welcome to Home");
        System.out.println("1.Blue bulb");
        System.out.println("2.red bulb");
        System.out.println("3.Fan");
        System.out.println("4. Nothing");

        Scanner scanner= new Scanner(System.in);
        System.out.println(" Enter your Input");
        int input = scanner.nextInt();

        switch(input) {

            case 1:
                System.out.println(" Switch on the blue bulb");

            case 2:
                System.out.println(" Switch on the red bulb");

            case 3:
                System.out.println(" Switch on the fan");

            case 4:
                System.out.println(" Nothing");
        }
    }
}

//Result: hit 1, execute all 1,2,3,4
//hit 2 execute 2,3,4
//hit 3 execute 3,4
// hit 4 execute 4
// hit 0 nothing will execute