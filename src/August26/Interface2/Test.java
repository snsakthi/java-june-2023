package August26.Interface2;

public class Test {
    public static void main(String[] args) {
        Tea tea=new Tea(){

            @Override
            public void sugar() {
                System.out.println(" 1 spoon sugar added...");

            }

            @Override
            public void chaipowder() {
                System.out.println(" half spoon powder added...");

            }

        };
        tea.sugar();
        tea.chaipowder();
    }

}
