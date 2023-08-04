package july11;

import java.util.Scanner;

public class DoNew1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println(" Enter your limit");
        int number = scanner.nextInt();

        int counter = 0;
        do{
            System.out.println(number);
            counter++;

        }while(counter < number);


    }


}
