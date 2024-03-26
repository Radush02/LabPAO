package lab4.task2;

import lab4.task2.exceptions.InvalidOperationException;

public  abstract class CalculatorResult{
    private final CalculatorRequest calculatorRequest;
    protected CalculatorResult(CalculatorRequest calculatorRequest){
        this.calculatorRequest = calculatorRequest;
    }

    public CalculatorRequest getRequest(){
        return calculatorRequest;
    }

    public CalculatorRequest getCalculatorRequest() {
        return calculatorRequest;
    }

    public abstract Object computeResult() throws InvalidOperationException;
}