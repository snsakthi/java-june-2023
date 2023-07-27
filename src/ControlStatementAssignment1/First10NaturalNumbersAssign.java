package ControlStatementAssignment1;

import java.util.Scanner;

public class First10NaturalNumbersAssign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println(" the first 10 natural numbers");

        int i = scanner.nextInt();
        do{
            System.out.println(i);

        }while(++i<=10);
    }
}
