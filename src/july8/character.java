package july8;

import java.util.Scanner;

public class character {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        char yes;
        do{
            System.out.println(" hello");
            yes=scanner.next().charAt(0);


        }while( yes == 'Y');


    }
}
