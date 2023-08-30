package August26.Interface;

public class Test {
    public static void main(String[] args) {

      /*  Samsung samsung =new Samsung();   instead of Mobile mobile=new Samsung();
          samsung.call();
          samsung.text();

      /* Mobile mobile=new Samsung(); */ //object instead of
        // Galaxy galaxy = new Galaxy();   instead of
        //Mobile galaxy=new Galaxy();
        //galaxy.call();
       // galaxy.text();      //method */

        //Anonymous class (i.e., no name in anonymous class)
        Mobile mobile=new Mobile() {

            @Override
            public void call() {
                System.out.println("Video Calling..");

            }

            @Override
            public void text() {
                System.out.println("WhatsApp Message..");

            }

        };
        mobile.call();
        mobile.text();
    }
}
