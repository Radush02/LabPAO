package lab4.task2;

import lab4.task2.exceptions.UnknownOperandTypeException;

public record CalculatorRequest(Object leftOperand, Object rightOperand, String operation) {
    public String getRequestType() throws UnknownOperandTypeException {
        Object l = leftOperand.getClass();
        Object r = rightOperand.getClass();
        if(l==Boolean.class && r==Boolean.class)
            return "Boolean";
        if(l==Double.class && (r==Double.class || r==Integer.class))
            return "Double";
        if(l==Integer.class && r==Double.class)
            return "Double";
        else if(l==Integer.class && r==Integer.class)
            return "Integer";
        throw new UnknownOperandTypeException(l+" & "+r);

    }
    @Override
    public String toString(){
        return leftOperand.toString() + " " + operation + " " + rightOperand.toString();
    }
}