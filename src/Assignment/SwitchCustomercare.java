package Assignment;

import java.util.Scanner;

public class SwitchCustomercare {
    public static void main(String[] args) {
        System.out.println(" Welcome to Bank Customer care");
        System.out.println("press 1 for English");
        System.out.println("press 2 for Tamil");
        System.out.println("Press 3 for French");
        System.out.println("Press 4 for Hindi");

         Scanner scanner =new Scanner(System.in);
        System.out.println("Enter language");
        int number=scanner.nextInt();

        System.out.println(" Enter your name");
        String name = scanner.next();

        System.out.println("Enter phone Number");
        int phonenumber =scanner.nextInt();

        System.out.println("Enter your number");
        System.out.println("Enter 1 for open Account Number");
        System.out.println("Enter 2 for ATM Card Request");
        System.out.println("Enter 3 for close Account Number");
        int input = scanner.nextInt();

        switch(input) {

            case 1 :
                System.out.println(" open new Account");
                break;

            case 2 :
                System.out.println("ATM Card Request ");
                break;

            case 3 :
                System.out.println(" Close Account number");
                break;

            default :
                System.out.println(" wrong input");


        }

        System.out.println("Thank you");
        String thankyou = scanner.next();
    }
}
