package August1.Tests;

class DateDemo{

    private int day; //variables
    private int month; //variables
    private int year; //variables

    public void printDate(){ //method
        System.out.println("Date : " + day + " / " + month+ " / " +year);
    }
}

public class Test1 {
    public static void main(String[] args) {
        DateDemo dateDemo=new DateDemo();
    }
}

// there is no output because didn't give print
//see Test2