package August26.FunctionalInterface2;

import java.sql.SQLOutput;

public class Test {
    public static void main(String[] args) {
             Car car=new Car(){

                 @Override
                 public void drive() {
                     System.out.println("driving....");
                 }
             };
             car.drive();
    }
}
