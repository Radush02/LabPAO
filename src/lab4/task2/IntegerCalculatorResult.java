package lab4.task2;

import lab4.task2.exceptions.InvalidOperationException;

public class IntegerCalculatorResult extends CalculatorResult {
    public IntegerCalculatorResult(CalculatorRequest calculatorRequest){
        super(calculatorRequest);
    }
    @Override
    public Integer computeResult() throws InvalidOperationException {
        CalculatorRequest cr = getRequest();
        Object l = cr.leftOperand(),r=cr.rightOperand();
        String op = cr.operation();
        switch(op){
            case "+":
                return (Integer) l + (Integer) r;
            case "-":
                return (Integer) l - (Integer) r;
            case "*":
                return (Integer) l * (Integer) r;
            case "/":
                if((Integer) r==0)
                    throw new InvalidOperationException("Impartire la 0 "+l+" "+op+" "+r);
                return (Integer) l / (Integer) r;
            default:
                throw new InvalidOperationException("Op. incorect "+l+" "+op+" "+r);
        }
    }
}
