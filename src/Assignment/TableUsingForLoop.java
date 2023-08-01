package Assignment;

import java.util.Scanner;

public class TableUsingForLoop {
    public static void main(String[] args) {
        System.out.println("Multiplication of 2");
         Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number");
        int num= scanner.nextInt();

        for(int i=1; i<=10; i++){

            System.out.println(i+ "*" +num +"  = "+i*num);
        }
    }
}
