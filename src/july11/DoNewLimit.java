package july11;

import java.util.Scanner;

public class DoNewLimit {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System .in);
        System.out.println(" Enter your limit");
        int limit = scanner.nextInt();
       int  counter = 1;
        do{
            System.out.println(counter);
            counter++;

        }while ( counter < limit);

    }
}
