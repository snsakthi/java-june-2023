package july8;

import java.util.Scanner;

public class StringName {
    public static void main(String[] args) {
        System.out.println(" Welcome to Home");
        System.out.println("1.Blue bulb");
        System.out.println("2.red bulb");
        System.out.println("3.Fan");
        System.out.println("4.Nothing");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your input");
        //pragraint input = scanner.nextInt();

         String name = scanner.next();

        switch(name) {

            case "Pragra" :
                System.out.println(" Switch on the blue bulb");
                break;

            case " Brampton" :
                System.out.println(" Switch on the red bulb");
                break;

                case  "Toranto" :
                    System.out.println(" Switch on the Fan");
                    break;

            default :
                System.out.println("Wrong Input");


    }



    }
}
