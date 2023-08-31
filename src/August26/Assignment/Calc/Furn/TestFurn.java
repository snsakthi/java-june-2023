package August26.Assignment.Calc.Furn;

public class TestFurn {
    public static void main(String[] args) {
        Furniture furniture =(circle -> {
            System.out.println("green circle");
        });

       furniture.shape("green circle");
    }
}
