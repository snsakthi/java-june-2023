package july8;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println( " Welcome to Calculator");
        Scanner sc =new Scanner(System.in);
        System.out.println(" Enter your input");
        int input=sc.nextInt();

      if (input==1) {
          System.out.println("Enter your first number");
          int num1 = sc.nextInt();
          System.out.println(" enter your second number");
          int num2 = sc.nextInt();

          int sum = num1 + num2;
          System.out.println(sum);
      }else if( input == 2){
          System.out.println("Enter your first number");
          int num1 = sc.nextInt();
          System.out.println(" enter your second number");
          int num2 = sc.nextInt();

          int sum = num1 - num2;
          System.out.println(sum);

      } else if(input == 3){
          System.out.println("Enter your first number");
          int num1 = sc.nextInt();
          System.out.println(" enter your second number");
          int num2 = sc.nextInt();

          int sum = num1 * num2;
          System.out.println(sum);

      }else if(input == 4){
          System.out.println("Enter your first number");
          int num1 = sc.nextInt();
          System.out.println(" enter your second number");
          int num2 = sc.nextInt();

          int sum = num1/num2;
          System.out.println(sum);
      }else if (input == 5){
          System.out.println("Enter your first number");
          int num1 = sc.nextInt();
          System.out.println(" enter your second number");
          int num2 = sc.nextInt();

          int sum = num1 % num2;
          System.out.println(sum);
      }else{
          System.out.println("wrong input");
      }




    }
}
