package August26.FunctionalInterface;

public class Test {
    public static void main(String[] args) {
        Mobile mobile=new Mobile(){
            @Override
            public void call() {
                System.out.println("calling...");
            }


        };

        mobile.call();

    }
}
