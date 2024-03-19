package lab2.task7;

public class DoubleCalculatorResult extends CalculatorResult{
    protected DoubleCalculatorResult(CalculatorRequest calculatorRequest) {
        super(calculatorRequest);
    }
    @Override
    public Double computeResult() throws Exceptie {
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
                    throw new Exceptie("Impartire la 0");
                return (Double) l / (Double) r;
            default:
                throw new Exceptie("Op. incorect");
        }
    }
}
