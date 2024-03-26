package lab4.task2.exceptions;

public class UnknownOperandTypeException extends CalculatorException {
    public UnknownOperandTypeException(String op) {
        super("Op nec. pt: " + op);
    }
    public UnknownOperandTypeException(){
        super("Op nec.");
    }
}