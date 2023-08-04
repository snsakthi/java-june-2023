package Assignment;

import java.util.Scanner;

public class CalculatorSwitchCase {
    public static void main(String[] args) {
        System.out.println(" Welcome to my Calculator");
        System.out.println(" 1.Addition");
        System.out.println(" 2.subtraction");
        System.out.println(" 3.Multiplication");
        System.out.println(" 4.Division");
        System.out.println(" 5. Modulus");

         Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter your Input");
        int num1;
        int num2;
        int sum;


        int input = scanner.nextInt();



                System.out.println(" Enter your first number");
                num1= scanner.nextInt();
                System.out.println(" Enter your second number");
                 num2= scanner.nextInt();

                switch(input){

                    case 1 :

                 sum =num1+num2;
                System.out.println("sum of "+num1+" and "+num2+" is equal to : " +sum);
                break;

            case 2 :

                 sum =num1-num2;
                System.out.println("sum of "+num1+" and "+num2+" is equal to : " +sum);
                break;

                    case 3 :
                        sum =num1*num2;
                        System.out.println("sum of "+num1+" and "+num2+" is equal to : " +sum);
                        break;

                    case 4 :
                        sum =num1/num2;
                        System.out.println("sum of "+num1+" and "+num2+" is equal to : " +sum);
                        break;

                    case 5 :
                        sum =num1%num2;
                        System.out.println("sum of "+num1+" and "+num2+" is equal to : " +sum);
                        break;

                    default :
                        System.out.println("wrong input");

        }
    }
}
