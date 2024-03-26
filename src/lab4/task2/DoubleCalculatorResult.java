package lab4.task2;

import lab4.task2.exceptions.InvalidOperationException;

public class DoubleCalculatorResult extends CalculatorResult {
    protected DoubleCalculatorResult(CalculatorRequest calculatorRequest) {
        super(calculatorRequest);
    }
    @Override
    public Double computeResult() throws InvalidOperationException {
        CalculatorRequest cr = getRequest();
        Object l = cr.leftOperand(),r=cr.rightOperand();
        String op = cr.operation();
        switch(op){
            case "+":
                return (Double) l + (Double) r;
            case "-":
                return (Double) l - (Double) r;
            case "*":
                return (Double) l * (Double) r;
            case "/":
                if((Double) r==0.0)
                    throw new InvalidOperationException("Impartire la 0 "+l+" "+op+" "+r);
                return (Double) l / (Double) r;
            default:
                throw new InvalidOperationException("Op. incorect "+l+" "+op+" "+r);
        }
    }
}
