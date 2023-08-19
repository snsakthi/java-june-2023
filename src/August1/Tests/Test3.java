package August1.Tests;
import java.util.*;
class DateDemo3{
    private int day;  // declare or initialize values in variables
    private int month;
    private int year;

    DateDemo3(){  //constructor
        day = 1;
        month = 10;
        year = 2023;
    }
    public void printDate(){
        System.out.println(" Date : " + day + " / " + month+ " / " +year);
    }
}

public class Test3 {
    public static void main(String[] args) {
        DateDemo3 dateDemo3 = new DateDemo3();
        dateDemo3.printDate();

    }
}
