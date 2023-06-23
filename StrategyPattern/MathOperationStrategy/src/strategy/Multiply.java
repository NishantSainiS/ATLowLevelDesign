package strategy;

public class Multiply implements FunctionStrategy {
    @Override
    public int doOperation(int a, int b) {
        return a*b;
    }
}
