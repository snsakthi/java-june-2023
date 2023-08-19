package August1.Tests;
class DateDemo2{
    private int day;
    private int month;
    private int year;

    public void printDate(){
        System.out.println(" Date :" + day + " / " + month+ " / " +year);
    }


}

public class Test2 {
    public static void main(String[] args) {
        DateDemo2 dateDemo=new DateDemo2();
        dateDemo. printDate(); // this will give some default value
    }
}


//see test3