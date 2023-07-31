package july8;

import java.util.Scanner;

public class TernaryOperatorScannerMethod2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter the number is odd/even");
        int number = 5674;
         String result = ( number%2 ==0) ? "even" : "odd";
        System.out.println(result);

    }
}
