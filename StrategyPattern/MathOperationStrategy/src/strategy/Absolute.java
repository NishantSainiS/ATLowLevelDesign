package strategy;

public class Absolute implements FunctionStrategy {
    @Override
    public int doOperation(int a, int b) {
        return a>b ? a-b : b-a;
    }
}
