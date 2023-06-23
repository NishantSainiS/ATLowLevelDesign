import strategy.Absolute;
import context.CalculatorContext;
import strategy.Multiply;
import strategy.Sum;

public class Main {
    public static void main(String[] args) {
        System.out.println("String ...");
        int a = 6,b = 7;
        System.out.println("a and b is : " + a + ", "+ b);
        CalculatorContext calculator = new CalculatorContext(new Absolute());
        System.out.println("absolute of a and b is : " + calculator.doOperation(a,b));

        calculator = new CalculatorContext(new Multiply());
        System.out.println("Multiplication of a and b is : " + calculator.doOperation(a,b));

        calculator = new CalculatorContext(new Sum());
        System.out.println("Summation of a and b is : " + calculator.doOperation(a,b));
        System.out.println("Ending ...");
    }
}