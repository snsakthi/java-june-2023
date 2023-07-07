public class AssignmentOperator {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = 30;
        System.out.println(x<y && x > z);
        System.out.println(x>y && x < z);
        System.out.println(x != y);
        System.out.println(y != z);
        System.out.println(x<y && x > z);
        System.out.println(x<y || x > z);

        System.out.println(x<y || (x >= z));
    }
}
