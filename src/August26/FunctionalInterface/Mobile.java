package August26.FunctionalInterface;

@FunctionalInterface
public interface Mobile {

         void call(); // abstract

    default void text(){                       //default implementation
        System.out.println("inside text..");
    }
     default void text2(){
         System.out.println("inside text...");
     }
     static void text3(){

     }
}


//1.Functional Interface --> only one abstract method(SAM; Single Abstract Method)
//2. but provide default implementation
//3.put static method as well