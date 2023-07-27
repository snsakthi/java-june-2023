package ControlStatementAssignment1;

import java.util.Scanner;

public class NtermsNaturalNumbers {
    public static void main(String[] args) {
        int  i;
        int n;
        int sum = 0;


        {
            Scanner scanner = new Scanner(System.in);
            System.out.print(" Input numbers");
            n = scanner.nextInt();
        }

        System.out.println("The first n natural numbers are :" + n);
        for (i = 1; i <= n; i++) {
            System.out.println(i);
            sum += i;
        }
        System.out.println(" the sum of natural numbers " + n + " terms :" + sum);


    }
}
