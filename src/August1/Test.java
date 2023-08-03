package August1;

class DateDemo{


    private int day;
    private int month;
    private int year;

    DateDemo(){
        day =1;
        month = 8;
        year = 2023;
    }

    public  void printDate() {
        System.out.println("Date: "+day+" /"+month+" / "+year);
    }


}

public class Test {
    public static void main(String[] args) {
        DateDemo datedemo= new DateDemo();
        datedemo.printDate();
    }
}
