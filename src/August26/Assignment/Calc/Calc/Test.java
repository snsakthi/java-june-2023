package August26.Assignment.Calc.Calc;
public class Test {
    public static void main(String[] args) {
       Calculator calculate=((num1,num2)-> {
           System.out.println(num1+" "+num2);
       });
       calculate .calculate(10,20);
       }
    }

               //new Calculator() {

        /*   @Override
           public void calculate(int num1, int num2) {
               int sum= num1+num2;
               System.out.println(sum);
           }
       };

        calculate.calculate(10,20);
    }
}
*/

