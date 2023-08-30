package August26.Interface;

public class Samsung implements Mobile{
    @Override
    public void call() {
        System.out.println("Calling...");

    }

    @Override
    public void text() {
        System.out.println("texting..");

    }

}
