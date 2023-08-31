package August26.Lambda;

public class Test {
    public static void main(String[] args) {

        Samsung samsung=new Samsung();
        Mobile mobile=new Mobile(){

            @Override
            public void call() {
                System.out.println("calling...");
            }
        };
             mobile.call();

             //Lambda
        Mobile mobile1 = () -> System.out.println("calling...");
        mobile1.call();

        System.out.println("mobile1");
    }
}


/* function interface--> only one abstract method
we can only create lambda for functional Interface
functional interface can have static and default method
 */