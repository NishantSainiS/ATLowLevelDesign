package strategy;

public class Sum implements FunctionStrategy {
    @Override
    public int doOperation(int a, int b) {
        return a+b;
    }
}
