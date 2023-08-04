package july8;

import java.util.Scanner;

public class TernaryOperatorScanner {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println(" Enter the number odd/even");
        int number = scanner.nextInt();
        String result=(number%2 == 0) ? "even" : "odd";
        System.out.println(result);
    }
}
