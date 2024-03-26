package lab4.task2;

import lab4.task2.exceptions.InvalidOperationException;

public class BooleanCalculatorResult extends CalculatorResult {
    protected BooleanCalculatorResult(CalculatorRequest calculatorRequest) {
        super(calculatorRequest);
    }

    @Override
    public Boolean computeResult() throws InvalidOperationException {
        CalculatorRequest cr = getRequest();
        Object l = cr.leftOperand(),r=cr.rightOperand();
        String op = cr.operation();
        if(op.equals("&"))
            return (Boolean) l && (Boolean) r;
        else if(op.equals("|"))
            return (Boolean) l || (Boolean) r;
        else{
            throw new InvalidOperationException("Op. incorect "+l+" "+op+" "+r);
        }

    }
}
