package context;

import strategy.FunctionStrategy;

public class CalculatorContext {
    FunctionStrategy functionStrategy;
    public CalculatorContext(FunctionStrategy strategy){
        functionStrategy = strategy;
    }
    public int doOperation(int a,int b){
        return functionStrategy.doOperation(a,b);
    }
}
