package july11;

import java.util.Scanner;

public class DoNew2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println(" Enter your limit");
        int number = scanner.nextInt();

        int counter = -5;
        do{
            System.out.println(counter);
            counter++;

        }while(counter < number);


    }


}


