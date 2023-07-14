package july11;

import java.util.Scanner;

public class GreatestNumberAssign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in);
        System.out.println(" Enter the first number : ");
        int first_number = scanner. nextInt();
        System.out.println(" Enter the second number : ");
        int second_number = scanner.nextInt();
        System.out.println(" Enter third number : ");
        int third_number = scanner. nextInt();
        if (first_number > second_number && first_number > third_number) {
            System.out.println("largest number :" + first_number);
        }else if (second_number> first_number && second_number > third_number ) {
            System.out.println(" largest number : " + second_number);
        }else if( third_number > second_number && third_number> first_number) {
            System.out.println("largest number : " + third_number);
        }else if (first_number == second_number && second_number == third_number && third_number == first_number) {
            System.out.println("numbers are equal");
        }else {
            System.out.println(" invalid");
        }


        }
    }

