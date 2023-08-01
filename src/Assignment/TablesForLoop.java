package Assignment;

import java.util.Scanner;

public class TablesForLoop {
    public static void main(String[] args) {
        System.out.println("Multiplication tables");

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the numbers");
        int num = scanner.nextInt();

        for(int i=1; i<=10; i++){
            for( int j=1; j<=10; j++){
                System.out.println(i+"*" +j+"=" +i*j);
            }
            System.out.println("Multiplication table of "+i+" is completed" );
        }

    }
}
