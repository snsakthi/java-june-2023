package july8;

import java.util.Scanner;

public class CalculatorWithCharacter {
    public static void main(String[] args) {

        System.out.println(" Welcome to my Calculator");
        System.out.println(" 1.Addition");
        System.out.println(" 2.subtraction");
        System.out.println(" 3.Multiplication");
        System.out.println(" 4.Division");
        System.out.println(" 5. Modulus");

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter your Input");
        char ch=scanner.next().charAt(0);

        if(ch =='+'){

            System.out.println("Enter your first number");
            int num1 = scanner.nextInt();
                    System.out.println(" enter your second number");
            int num2 = scanner.nextInt();

            int sum = num1 + num2;
            System.out.println(" sum of "+num1+" and "+num2+" is equal to :"+sum);

        } else if (ch =='-'){

            System.out.println("Enter your first number");
            int num1 = scanner.nextInt();
            System.out.println(" enter your second number");
            int num2 = scanner.nextInt();

            int sum = num1 + num2;
            System.out.println(" sum of "+num1+" and "+num2+" is equal to :"+sum);



        } else if (ch =='*'){

            System.out.println("Enter your first number");
            int num1 = scanner.nextInt();
            System.out.println(" enter your second number");
            int num2 = scanner.nextInt();

            int sum = num1 + num2;
            System.out.println(" sum of "+num1+" and "+num2+" is equal to :"+sum);



        }else if (ch =='/'){

            System.out.println("Enter your first number");
            int num1 = scanner.nextInt();
            System.out.println(" enter your second number");
            int num2 = scanner.nextInt();

            int sum = num1 + num2;
            System.out.println(" sum of "+num1+" and "+num2+" is equal to :"+sum);



        }else if (ch =='%'){

            System.out.println("Enter your first number");
            int num1 = scanner.nextInt();
            System.out.println(" enter your second number");
            int num2 = scanner.nextInt();

            int sum = num1 + num2;
            System.out.println(" sum of "+num1+" and "+num2+" is equal to :"+sum);



        } else{
            System.out.println(" wrong input");
        }
    }
}
