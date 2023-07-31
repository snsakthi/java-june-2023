package july8;

import java.util.Scanner;

public class TernaryOperatorInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the number is odd/even");
        int number= scanner.nextInt();

        int integerResult =(number%2 == 0) ? 10 : 20;

        // IF THE NUMBER IS EVEN PRINT 10//
        //IF THE NUMBER IS ODD PRINT 20//
        System.out.println( integerResult);

    }
}
